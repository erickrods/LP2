import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Graphics;
import java.io.*;
import figures.*;
import ivisible.*;


public class App {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
        frame.setFocusTraversalKeysEnabled(false);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<>();
    Figure figuraSelecionada = null;
    Figure auxSelecionada = null;
    Point posicaoMouse = null;
    ArrayList<Button> buttons = new ArrayList<>();
    Button botaoSelecionado = null;
    Random aleatoria = new Random();
    private static final int tamPadrao = 90;

    private static class teclaCodigo {
        private static final int pageUP = 33;
        private static final int pageDOWN = 34;
        private static final int up = 38;
        private static final int down = 40;
        private static final int left = 37;
        private static final int right = 39;
        private static final int delete = 127;
        private static final int maior = 112;
        private static final int menor = 113;
        private static final int TAB = 9;
    }

    ListFrame() {
        buttons.add(new Button(new Rect(40, 60, 30, 30), 0));
        buttons.add(new Button(new Ellipse(40, 115, 30, 30), 1));
        buttons.add(new Button(new Linha(40, 170, 30, 30, Color.BLACK, null), 2));
        buttons.add(new Button(new Tri(40, 225, 30, 30), 3));


        try {
            //@SuppressWarnings({"unchecked"})
            FileInputStream f = new FileInputStream("project.bin");
            ObjectInputStream o = new ObjectInputStream(f);
            this.figs = (ArrayList<Figure>) o.readObject();
            o.close();
        } catch (Exception l) {
            System.out.println("ERRO!");
        }

        this.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        try {
                            FileOutputStream f = new FileOutputStream("project.bin");
                            ObjectOutputStream o = new ObjectOutputStream(f);
                            o.writeObject(figs);
                            o.flush();
                            o.close();
                        } catch (Exception l) {
                            System.out.println(l.getMessage());
                        }
                        System.exit(0);
                    }
                }
        );
        this.addKeyListener(
                new KeyAdapter() {
                    public void keyPressed(KeyEvent evt) {
                        Point p = MouseInfo.getPointerInfo().getLocation();
                        int x = p.x - getLocation().x;
                        int y = p.y - getLocation().y;
                        Color corAleatoria = new Color(aleatoria.nextInt(255), aleatoria.nextInt(255), aleatoria.nextInt(255));
                        if (evt.getKeyChar() == 'r') {
                            Rect r = new Rect(x, y, tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                            figs.add(r);
                            repaint();
                        } else if (evt.getKeyChar() == 'e') {
                            Ellipse e = new Ellipse(x, y, tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                            figs.add(e);
                            repaint();
                        } else if (evt.getKeyChar() == 't') {
                            Tri t = new Tri(x, y, tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                            figs.add(t);
                            repaint();
                        } else if (evt.getKeyChar() == 'l') {
                            Linha l = new Linha(x, y, tamPadrao, tamPadrao, Color.BLACK, null);
                            figs.add(l);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.up) {
                            figuraSelecionada.mover(0, -10);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.down) {
                            figuraSelecionada.mover(0, 10);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.left) {
                            figuraSelecionada.mover(-10, 0);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.right) {
                            figuraSelecionada.mover(10, 0);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.pageUP) {
                            figuraSelecionada.corBorda(corAleatoria);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.pageDOWN) {
                            figuraSelecionada.corInterior(corAleatoria);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.delete) {
                            figs.remove(figuraSelecionada);
                            figuraSelecionada = null;
                        } else if (evt.getKeyCode() == teclaCodigo.maior) {
                            figuraSelecionada.alterarTamanho(5, 5);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.menor) {
                            figuraSelecionada.alterarTamanho(-5, -5);
                            repaint();
                        } else if (evt.getKeyCode() == teclaCodigo.TAB) {
                            if (figuraSelecionada == null) {
                                if (figs.size() > 0) {
                                    figuraSelecionada = figs.get(0);
                                }
                            } else {
                                figuraSelecionada = figs.get((figs.indexOf(figuraSelecionada) + 1) % figs.size());
                                repaint();
                            }
                        }
                        repaint();
                    }
                }
        );
        this.addMouseListener(
                new MouseAdapter() {
                    public void mousePressed(MouseEvent evt) {
                        figuraSelecionada = null;
                        posicaoMouse = getMousePosition();
                        for (int i = 0; i < figs.size(); i++) {
                            if (figs.get(i).clicked(posicaoMouse.x, posicaoMouse.y)) {
                                figuraSelecionada = figs.get(i);
                            }
                            if (figuraSelecionada != null) {
                                figs.remove(figuraSelecionada);
                                figs.add(figuraSelecionada);
                                repaint();
                            }
                        }
                        for (int j = 0; j < buttons.size(); j++) {
                            if (buttons.get(j).clicked(posicaoMouse.x, posicaoMouse.y)) {
                                botaoSelecionado = buttons.get(j);
                                repaint();
                            }
                        }
                        if (botaoSelecionado != null) {
                            Point novaPosicaoMouse = new Point(evt.getX(), evt.getY());
                            boolean clickBotao = false;
                            for (Button button : buttons) {
                                if (button.clicked(novaPosicaoMouse.x, novaPosicaoMouse.y) == true) {
                                    clickBotao = true;
                                }
                            }

                            if (clickBotao == false) {
                                switch (botaoSelecionado.buttonIndex) {
                                    case 0:
                                        Rect r = new Rect(novaPosicaoMouse.x, novaPosicaoMouse.y, tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                                        figs.add(r);
                                        break;
                                    case 1:
                                        Ellipse e = new Ellipse(novaPosicaoMouse.x, novaPosicaoMouse.y,tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                                        figs.add(e);
                                        break;
                                    case 2:
                                        Linha l = new Linha(novaPosicaoMouse.x, novaPosicaoMouse.y, tamPadrao, tamPadrao, Color.BLACK, null);
                                        figs.add(l);
                                        break;
                                    case 3:
                                        Tri t = new Tri(novaPosicaoMouse.x, novaPosicaoMouse.y, tamPadrao, tamPadrao, Color.BLACK, Color.WHITE);
                                        figs.add(t);
                                        break;
                                    default:
                                }
                                repaint();
                                botaoSelecionado = null;
                            }
                        }
                    }
                }
        );
        this.addMouseMotionListener(
                new MouseAdapter() {
                    public void mouseDragged(MouseEvent evt) {
                        if (figuraSelecionada != null) {
                            int xDrag = evt.getX() - posicaoMouse.x;
                            int yDrag = evt.getY() - posicaoMouse.y;
                            figuraSelecionada.mover(xDrag, yDrag);
                        }
                        posicaoMouse = evt.getPoint();
                        repaint();

                    }
                }
        );

        this.setTitle("Projeto");
        this.setSize(1000, 1000);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        for (Figure figures : this.figs) {
            figures.paint(g);
        }

        for (Button but : this.buttons) {
            but.paint(g);
        }
        if (figuraSelecionada != null){
            figuraSelecionada.foco(g);
        }
        if (botaoSelecionado != null){
            botaoSelecionado.foco(g);
        }
    }
}
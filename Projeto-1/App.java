import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.MouseInfo;
import java.awt.Graphics;
import java.util.Random;

import figures.*;

public class App {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}
class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<>();
    Figure figuraSelecionada = null;
    Figure auxSelecionada = null;
    Point posicaoMouse = null;

    Random aleatoria = new  Random();
    private static class  teclaCodigo {
        private static final int pageUP = 33;
        private static final int pageDOWN = 34;
        private static final int up = 38;
        private static final int down = 40;
        private static final int left = 37;
        private static final int right = 39;
        private static final int delete = 127;
        private static final int maior = 112;
        private static final int menor = 113;
    }
    ListFrame () {
        this.addWindowListener (
                new WindowAdapter() {
                    public void windowClosing (WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        this.addKeyListener (
                new KeyAdapter() {
                    public void keyPressed(KeyEvent evt) {
                        Point p = MouseInfo.getPointerInfo().getLocation();
                        int x = p.x - getLocation().x;
                        int y = p.y - getLocation().y;
                        Color corAleatoria = new Color(aleatoria.nextInt(255),aleatoria.nextInt(255),aleatoria.nextInt(255));
                        if (evt.getKeyChar() == 'r') {
                            Rect r = new Rect(x, y, 140, 100, Color.BLACK, Color.WHITE);
                            figs.add(r);
                            repaint();
                        } else if (evt.getKeyChar() == 'e') {
                            Ellipse e = new Ellipse(x, y, 110, 100, Color.BLACK, Color.WHITE);
                            figs.add(e);
                            repaint();
                        } else if (evt.getKeyChar() == 't') {
                            Tri t = new Tri(x, y, 120, 60, Color.BLACK, Color.WHITE);
                            figs.add(t);
                            repaint();
                        } else if (evt.getKeyChar() == 'l') {
                            Linha l = new Linha(x, y, 120, 100, Color.BLACK, null);
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
                            }else if (evt.getKeyCode() == teclaCodigo.pageDOWN) {
                            figuraSelecionada.corInterior(corAleatoria);
                            repaint();
                            }else if (evt.getKeyCode() == teclaCodigo.delete) {
                                figs.remove(figuraSelecionada);
                                figuraSelecionada = null;
                            }else if (evt.getKeyCode() == teclaCodigo.maior) {
                            figuraSelecionada.alterarTamanho(5,5);
                            repaint();
                            }else if (evt.getKeyCode() == teclaCodigo.menor) {
                            figuraSelecionada.alterarTamanho(-5,-5);
                            repaint();
                            }
                            repaint();
                        }
                }

        );
        this.addMouseListener(
                new MouseAdapter() {
                    public void mousePressed(MouseEvent evt) {
                        posicaoMouse = getMousePosition();
                        figuraSelecionada = null;
                        for (int i = 0; i < figs.size(); i++) {
                            if (figs.get(i).clicked(posicaoMouse.x, posicaoMouse.y)) {
                                figuraSelecionada = figs.get(i);
                            } else {
                                for (int j = 0; j < figs.size(); j++) {
                                        figs.get(j).borderColor = figs.get(j).borderColor;
                                    }
                                }
                            }
                            if (figuraSelecionada != null) {
                                figs.remove(figuraSelecionada);
                                figs.add(figuraSelecionada);
                                auxSelecionada = figuraSelecionada;
                                repaint();
                            } else if (figuraSelecionada != auxSelecionada) {
                                figs.remove(auxSelecionada);
                                figs.add(auxSelecionada);
                                repaint();

                            }
                        }

                }

        );
        this.addMouseMotionListener(
                new MouseAdapter(){
                        public void mouseDragged(MouseEvent evt){
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

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
        if (figuraSelecionada != null){
            figuraSelecionada.foco(g);
        }
    }
}
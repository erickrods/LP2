package stack;

import java.util.ArrayList;
import istackable.IStackable;

public class ArrayStack implements IStackable {

public ArrayList<Integer> stack = new ArrayList<Integer>();

public int size (){
	return this.stack.size();
}

public void push(int v){
	this.stack.add(v);
};

public  int pop (){
	int index =stack.size() - 1;
	int valor = stack.get(index);
	this.stack.remove(stack.size() - 1);
	return valor;
};
};

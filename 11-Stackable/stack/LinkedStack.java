package stack;

import java.io.*;
import java.util.LinkedList;
import istackable.IStackable;

public class LinkedStack implements IStackable {

public LinkedList stack = new LinkedList(); 

public int size (){
	return this.stack.size();
}

public void push(int v){
	this.stack.add(v);
};

public int pop (){
	int index = (stack.size()-1);
	this.stack.getLast();
	System.out.format("v=%d, sz=%d\n", this.stack.getLast(), index);
	this.stack.remove(stack.size() - 1);
	return 0;
};

};

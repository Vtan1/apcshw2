import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t, prev;
    public LLit(Node<E> n){
	t=n;
	prev = null;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	prev = t;
	t=t.getNext();
	return retval;
    }

    public void remove() {
	prev.setNext(t.getNext());
	t=t.getNext();
    }
}

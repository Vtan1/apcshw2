import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	myStack<E> a = new myStack<E>();
	Node<E> n = new Node<E>(1);
	a.push(n);
	System.out.println(a.top());		
	System.out.println(a.pop());
	System.out.println(a.empty());
    }
}

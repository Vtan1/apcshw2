public class myStack<E>{
    
    private Node<E> n;
    private int size;
    
    public void push(E data){
	Node<E> tmp = n;
	while(tmp.getNext()!=null){
	    tmp = tmp.getNext();
	}
	Node<E> a = new Node<E>(data);
	tmp.setNext(a);
	size++;
    }

    public E pop() {
	Node<E> tmp = n;
	while(tmp.getNext().getNext()!=null){
	    tmp = tmp.getNext();
	}
	Node<E> retnode = tmp.getNext();
	tmp.setNext(null);
	size--;
	return retnode.getData();

    }
    
    public boolean empty(){
	if (n.getNext() == null) {
	    return true;
	} else {
	    return false;
	}
    }
    
    public E top(){
	Node<E> tmp = n;
	while(tmp.getNext().getNext()!=null){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }	
}

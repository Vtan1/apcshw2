public class queue<E> {
    //back means back of the queue
    private Node<E> back;
    private Node<E> front;
    private int len;
    
    public queue() {
	front = new Node<E>();
	back = front;
	len = 0;
    }

    /*
    public void enqueue(E data) {
	Node<E> tmp = new Node<E>(data);
	back.setNext(tmp);
	back = tmp;
	len++;
    }
    */
    
    public void enqueue(E data) {
	Node<E> tmp = new Node<E>(data);
	if (front == back) {
	    front = tmp;
	    back = tmp;
	} else {
	    back.setNext(tmp);
	    back=tmp;
	}
    }

    public E dequeue() {
	E retval = front.getData();
	front = front.getNext();
	len--;
	if (start == null)
	    end = null;
	return retval;
    }

    public boolean empty() {
	return (front == back);
    }

    public E front() {
	return front.getNext().getData();
    }

    public static void main(String[] args) {
	queue<Integer> q = new queue<Integer>();
	q.enqueue(10);
	q.enqueue(11);
	//q.dequeue();
	System.out.println(q.front());
    }
}

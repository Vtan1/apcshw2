public class queue<E> {
    //back means back of the queue
    private Node back;
    private Node front;
    private int len;
    
    public queue() {
	front = null;
	back = null;
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
    
    public void enqueue(int a, int b) {
	Node tmp = new Node(a,b);
	if (front == null) {
	    front = tmp;
	    back = tmp;
	} else {
	    back.setNext(tmp);
	    back=tmp;
	}
    }

    public Node dequeue() {
	if (front==null) {
	    return null;
	}
	Node retval = front;
	front = front.getNext();
	len--;
	if (front == null)
	    back = null;
	return retval;
    }

    public boolean empty() {
	return (front == null);
    }

    public Node front() {
	return front;
    }

    public static void main(String[] args) {
	queue<Integer> q = new queue<Integer>();
	q.enqueue(10,11);
	q.enqueue(100,100);
	q.dequeue();
	System.out.println(q.front());
    }
}

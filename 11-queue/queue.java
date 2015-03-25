public class queue {
    private Node<E> l;
    private Node<E> f;
    private int len;

    public queue() {
	l = new Node<E>();
	f = new Node<E>();
	l.setNext(f);
	len = 0;
    }

    public void enqueue(x) {
	Node<E> tmp = new Node<E>(x);
	tmp.setNext(l);
	l = tmp;
	len++;
    }

    public Node<E> dequeue() {
	
}

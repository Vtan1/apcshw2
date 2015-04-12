public class Node{
    private int x, y;
    //private E data;
    private Node next;

    public Node(int a, int b){
	x = a;
	y = b;
    }
    public int getX() {
	return x;
    }
    public int getY() {
	return y;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+x+","+y;
    }
}

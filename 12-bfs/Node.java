public class Node{
    private int x, y;
    private Node prev;
    //private Node next;

    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }
    
    public Node getPrev() {
	return prev;
    }
    public void setPrev(Node n) {
	prev = n;
    }
    public int getX() {
	return x;
    }
    public int getY() {
	return y;
    }
    /*
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+x+","+y;
    }
    */
}


public class Node {
    private int x,y;
    private Node prev;
    private int priority; //priority is distance
		
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public void setPriority(int xcoor, int ycoor) {
	priority = (((xcoor - 18) * (xcoor - 18)) + ((ycoor - 27) * (ycoor - 27)));
    }

    public int getPriority() {
	return priority;
    }
		
}











import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	int i = 0;
	
	//l.add(n);
	if (l.isEmpty()) {
	    l.add(n);
	} else if {
	    while (l.get(i).getPriority() < n.getPriority()) {
		i++;
	    }
	}
	l.add(i, n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}











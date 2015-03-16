public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node find(int n) {
	Node ans = l;
	for (int i = 0; i < n; i++) {
	    ans = ans.getNext();
	}
	return ans;
    }

    public void insert(int n, String s) {
	Node insertion  = new Node(s);
	Node ahead = find(n);
	if (n == 0) {
	    l = insertion;
	}
	else if (n > 0) {
	    Node before = find(n-1);
	    before.setNext(insertion);
	}
	insertion.setNext(ahead);
    }
}

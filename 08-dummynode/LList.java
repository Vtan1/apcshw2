public class LList {
    private Node l;
    private int len;
    
    public LList() {
	l = new Node("");
	len = 0;
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
    
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public String get(int n) {
	Node ans = l;
	for (int i = 0; i < n; i++) {
	    ans = ans.getNext();
	}
	return ans.getNext().getData();
    }
    
    public void add(int n, String s) {
	Node insertion  = new Node(s);
	Node before = l;
	for (int i = 0;i < n;i++) {
	    before = before.getNext();
	}
	Node after = before.getNext();
	before.setNext(insertion);
	insertion.setNext(after);
	len++;
    }

    public String remove(int n) {
	Node x = l;
	for (int i = 0;i < n;i++) {
	    x = x.getNext();
	}
	String tmp = x.getNext().getData();
	x.setNext(x.getNext().getNext());
	len--;
	return tmp;
    }
}

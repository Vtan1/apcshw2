public class LList {
    private Node l;
    private int len;
    
    public LList() {
	l = new Node();
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
    
    public void add(int s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public int get(int n) {
	Node ans = l;
	for (int i = 0; i < n; i++) {
	    ans = ans.getNext();
	}
	return ans.getNext().getData();
    }
    
    public void add(int n, int s) {
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

    public int remove(int n) {
	Node x = l;
	for (int i = 0;i < n;i++) {
	    x = x.getNext();
	}
	int tmp = x.getNext().getData();
	x.setNext(x.getNext().getNext());
	len--;
	return tmp;
    }

    public boolean removeinstance(int n) {
	Node T = l;
	while (T.getNext() != null) {
	    if (T.getNext().getData() == n) {
		T.setNext(T.getNext().getNext());
		return true;
	    }
	}
	return false;
    }


    //piggy backing, can be useful with more pointers.
    //kinda like T2 is catching up to T each time.
    public boolean remove2(int n) {
	Node T=l.getNext();
	Node T2 = l;
	while (T != null) {
	    if (T.getData() == n) {
		T2.setNext(T.getNext());
		return true;
	    }
	    T2 = T;
	    T=T.getNext();
	}
	return false;
    }
}

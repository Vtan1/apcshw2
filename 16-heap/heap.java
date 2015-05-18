public class heap {
    public Node T;
    public int[] heapArr;

    public heap() {
	heapArr = new int[10000];
    }

    public int findMin(Node t) {
	return t.getData();
    }

    public void insert(Node t, Node add) {
	Node T = t;
	Node T2 = T.getLeft();
	while (T2 != null) {
	    T = T2;
	    T2 = T.getLeft();
	}
	T.setLeft(add);
	pushdown(t);
    }

    // void method to sort tree so that min is on top
    // one param - root of the tree
    public void pushdown(Node t) {
	Node T = t;
	int tmp = 0;
	if (T.getLeft() != null) {
	    if (T.getLeft().getData() < T.getData()) {
		T.setLeft(T);
		tmp = heapArr[1];
		heapArr[1] = heapArr[0];
		T = T.getLeft();
		heapArr[0] = tmp;
	    }
	} else if (T.getRight() != null) {
	    if (T.getRight().getData() < T.getData()) {
		T.setRight(T);
		tmp = heapArr[2];
		heapArr[2] = heapArr[0];
		T = T.getRight();
		heapArr[0] = tmp;
		
	    }
	}
	pushdown(T.getLeft());
	pushdown(T.getRight());	
    }
}

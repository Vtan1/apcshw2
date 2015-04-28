public class Tree {
    private Node T;

    public Tree() {
	T = new Node();
    }

    public void insert(Node t, int i) {
	//Node tmp = new Node();
	//tmp.setData(i);
	Node T = t;
	Node T2;
	if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i < T.getData()) {
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	if (i < T2.getData()) {
	    T2.setLeft(i);
	} else {
	    T2.setRight(i);
	}
    }

    public Node search(Node t, int i) {
	Node T = t;
	Node T2;
	if (i == T.getData()) {
	    return T;
	} else if (i < T.getData()) {
	    T2 = T.getLeft();
	} else {
	    T2 = T.getRight();
	}
	while (T != null) {
	    if (i == T.getData()) {
		return T;
	    } else if (i < T.getData()){
		T2 = T;
		T = T.getLeft();
	    } else {
		T2 = T;
		T = T.getRight();
	    }
	}
	return null;
	// if (i = T2.getData()) {
	//     T2.setLeft(i);
	// } else {
	//     T2.setRight(i);
	// }
    }

    public void rinsert(Node t, int i) {
	Node T = t;
	Node T2;
	if (i < T.getData()) {
	    T2 = T;
	    T = T.getLeft();
	} else {
	    T2 = T;
	    T = T.getRight();
	}
	if (T != null) {
	    if (i < T.getData()) {
		rinsert(T.getLeft(), i);
	    } else {
		rinsert(T.getRight(), i);
	    }
	} else {
	    if (i < T2.getData()) {
		T2.setLeft(i);
	    } else {
		T2.setRight(i);
	    }
	}
    }

    public Node rsearch(Node t, int i) {
	Node T = t;
	if (i == T.getData() || T == null) {
	    return T;
	} else if (i < T.getData()) {
	    return rsearch(T.getLeft(), i);
	} else {
	    return rsearch(T.getRight(), i);
	}

    }

    public String traverse(Node T) {
	String s = "";
	if (T==null)
	    return s;
	s = s  + traverse(T.getLeft()) + T.getData() + traverse(T.getRight());
	return s;
    }

    public String toString() {
	Node tmp = T;
	String s = "";
	if (tmp == null) {
	    return s;
	} else {
	    s = s + traverse(tmp);
		//+ traverse(tmp.getLeft()) + traverse(tmp.getRight());
	}
	return s;
    }
}


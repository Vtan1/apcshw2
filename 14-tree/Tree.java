public class Tree {
    private Node T;

    public Tree() {
	T = new Node();
    }

    public Node search(Node t, int i) {
	t = T;
	while (T!=null)

public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	for (int i=0;i < 5; i++){
	    l.add(i);
	}

	l.add(100);
	System.out.println(l);
    }
}

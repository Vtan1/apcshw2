import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(i);
	}
	System.out.println(l);
	//System.out.println(l.get(9));
	//l.add(3,500);
	//System.out.println(l);
	//l.remove(3);
	//System.out.println(l);
    }
}

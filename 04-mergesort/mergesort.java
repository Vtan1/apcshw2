import java.io.*;
import java.util.*;

public class mergesort {
    public ArrayList<Integer> test1;
    public ArrayList<Integer> test2;

    public mergesort() {
	test1 = new ArrayList<Integer>();
	test1.add(1);
	test1.add(2);
	test1.add(5);
	test1.add(6);
	test2 = new ArrayList<Integer>();
	test2.add(3);
	test2.add(4);
	test2.add(6);
	test2.add(8);
    }

    public ArrayList<Integer> getTest1() {
	return test1;
    }

    public ArrayList<Integer> getTest2() {
	return test2;
    }
    
    public ArrayList<Integer> merge (ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> returnList = new ArrayList<Integer>();
	while (A.size() > 0 && B.size() > 0) {
	    //int i = 0;
	    if (A.get(0) >= B.get(0)) {
		returnList.add(A.remove(0));
		//returnList.set(i,A.remove(0));
		//A.remove(0);
	    } else if (B.get(0) > A.get(0)) {
		returnList.add(B.remove(0));
		//returnList.set(i,B.remove(0));
		//B.remove(0);
	    }
	    //i++;
	}
	return returnList;
    }

    public static void main(String[] args) {
	mergesort m = new mergesort();
	System.out.println(m.merge(m.getTest2(),m.getTest1()));
	//m.merge(test1,test2);
    }
}

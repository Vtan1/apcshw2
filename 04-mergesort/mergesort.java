import java.io.*;
import java.util.*;

public class mergesort {

    public ArrayList<Integer> merge (ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> returnList = new ArrayList<Integer>();
	while (A.size() > 0 && B.size() > 0) {
	    if (A.get(0) >= B.get(0)) {
		returnList.add(B.remove(0));
	    } else {
		returnList.add(A.remove(0));
	    }
	}
	while (A.size() > 0) {
	    returnList.add(A.remove(0));
	} 
	while (B.size() > 0) {
	    returnList.add(B.remove(0));
	}
	return returnList;
    }

    public ArrayList<Integer> sort (ArrayList<Integer> C) {
	if (C.size() == 1) {
	    return C;
	}
	ArrayList<Integer> half1 = new ArrayList<Integer>();
	ArrayList<Integer> half2 = new ArrayList<Integer>();
	int place;
	for (place = 0; place < C.size()/2; place++) {
	    half1.add(C.get(place));
	}
	while (place < C.size()) {
	    half2.add(C.get(place));
	    place++;
	}
	return merge(sort(half1),sort(half2));
    }

    public static void main(String[] args) {
	mergesort m = new mergesort();
	ArrayList<Integer> test1 = new ArrayList<Integer>();
	ArrayList<Integer> test2 = new ArrayList<Integer>();
	test1.add(1);
	test1.add(5);
	test1.add(2);
	test1.add(6);
	test1.add(4);
	test2.add(3);
	test2.add(4);
	test2.add(6);
	test2.add(8);
	//System.out.println(m.merge(test1,test2));
	//System.out.println(m.sort(test1));
    }
}
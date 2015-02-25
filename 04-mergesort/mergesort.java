import java.io.*;
import java.util.*;

public class mergesort {

    public ArrayList<int> merge (ArrayList<int> A, ArrayList<int> B) {
	ArrayList<int> returnlist;
	while (A.size() > 0 && B.size() > 0) {
	    int i = 0;
	    if (A.get(0) >= B.get(0)) {
		returnList.set(i,A.remove(0));
		i++;
	    }
	    if (B.get(0) > A.get(0)) {
		returnList.set(i,B.remove(0));
		i++;
	    }
	}
	return 
    }
    
}

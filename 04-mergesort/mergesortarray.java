import java.util.*;
import java.io.*;

public class mergesortarray {
    
    public int[] merge (int[] a, int[] b) {
	int[] returnList = new int[a.length + b.length];
	int c = 0;
	int ca = 0;
	int cb = 0;
	while (a.length > ca && b.length > cb) {
	    if (a[ca] >= b[cb]) {
		returnList[c] = b[cb];
		cb++;
	    } else {
		returnList[c] = a[ca];
		ca++;
	    }
	    c++;
	}
	while (a.length > ca) {
	    returnList[c] = a[ca];
	    c++;
	}
	while (b.length > cb) {
	    returnList[c] = b[cb];
	    c++;
	}
	return returnList;
    }

    public int[] sort (int[] c) {
	if (c.length == 1) {
	    return c;
	}
	int[] half1 = new int[c.length / 2];
	int[] half2 = new int[c.length / 2 + 1];
	int place;
	int counter = 0;;
	for (place = 0; place < half1.length; place++, counter++) {
	    half1[place] = c[counter];
	}
	for (place = 0; counter < c.length; place++, counter++) {
	    half2[place] = c[counter];
	}
	return merge(sort(half1), sort(half2));
    }

    public static void main(String[] args) {
	mergesortarray m = new mergesortarray();
    }
}
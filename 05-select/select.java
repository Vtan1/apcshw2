/*
1. choose a pivot value, which can be any value
2. partition the list, rearrange so the values less than pivot are to the left
and the larger ones are to the right
3. now pivot is the at final location
4. either we're done if pivot is kth smallest or call select on upper or lower
parts as appropriate
*/

import java.util.*;

public class select {
   
    public int[] partition(int[] L, int SI, int EI) {
	int[] D = new int[L.length];

	for (int x = 0;x < SI; x++) {
	    D[x] = L[x];
	}
	for (int y = EI + 1;y < L.length; y++) {
	    D[y] = L[y];
	}

	int pivot = L[SI];
	SI++;
	
	for (int z = SI;z < EI + 1;z++) {
	    if (L[z] < pivot) {
		D[SI] = L[z];
		SI++;
	    } else {
		D[EI] = L[z];
		EI--;
	    }
	    
	    if (SI == EI) {
		D[SI] = pivot;
	    }
	}
	return D;
    }
    
    public int Select(int[] A,int k,int l, int h) {
	int pivot = A[k];
	
}
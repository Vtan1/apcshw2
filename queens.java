import java.util.*;
import java.io.*;

public class queens {
    private char[][] board;
    private int maxxy;
    public queens() {
	maxxy = 5;
	board = new char[maxxy][maxxy];

	public String toString() {
	    String s = "";
	    for (int y = 0;y < maxxy;y++) {
		for (int x = 0;x < maxxy;x++) {
		    s = s = board[x][y];
		}
		s = s + "\n";
	    }
	    return s;
	}

	public void solve() {

	}
    }
}

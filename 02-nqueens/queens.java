import java.util.*;
import java.io.*;

public class queens {
    private char[][] board;
    private int maxxy;
    private char queen = 'Q';
    private char space = '_';

    public queens() {
	maxxy = 5;
	board = new char[maxxy][maxxy];
	for (int row = 0;row < maxxy;row++) {
	    for (int col = 0;col < maxxy;col++) {
		board[row][col] = space;
	    }
	}
    }

    public String toString() {
	String s = "";
	for (int y = 0;y < maxxy;y++) {
	    for (int x = 0;x < maxxy;x++) {
		s = s + board[x][y];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean checker(int row, int col) {
	//checks row for queens
	for (int x = 0;x < col;x++) {
	    if (board[row][x] == queen) {
		return false;
	    }
	}

	int r,c;
	for (r = row, c = col; r < maxxy && c >= 0; r++, c--) {
	    if (board[r][c] == queen) {
		return false;
	    }
	}

	for (r = row, c = col; r >= 0 && c >= 0; r--, c--) {
	    if (board[r][c] == queen) {
		return false;
	    }
	}
	//if there are no queens in the row or in the diags, then it's good.
	return true;
   
    }

    //from Johnny's code
    public boolean solve(int column) {
	if (column == maxxy) {
	    return true;
	}
	for (int row = 0;row < maxxy;row++) {
	    if (checker(row,column)) {
		board[row][column] = queen;
		System.out.println(this);
		if (solve(column+1)) {
		    return true;
		}
		board[row][column] = space;
		//if it doesn't work, then it goes backwards to make it work
	    }
	}
	return false;
    }

    public void solve() {
	if (solve(0)) {
	    System.out.println(this);
	} else {
	    System.out.println("No solution");
	}
    }

    public static void main(String[] args) {
	queens q = new queens();
	System.out.println(q);
    }
}
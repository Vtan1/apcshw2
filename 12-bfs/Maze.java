import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    //private boolean solved = false;
    
    private queue frontier;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {
	}
    }
		
    public Maze() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];			
	try {		
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++) {
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	}
	catch (Exception e){
	}			
    }
		
    public String toString() {
	String s = "[2J\n";			
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	return s;
    }

    //checks to see if the square is in the board and is a path
    public boolean checkAround(int a, int b) {
	if ((a > -1 && a < maxX) && (b > -1 && b < maxY)) {
	    if (board[a][b]==path) {
		return true;
	    }
	}
	return false;
    }

    /*
      enqueues a point, then checks to see if that point is the exit.
      if it's an exit, then it stops.
      then checks all around the point and enqueues them if they're part of the
      path. sets current point to "me".
      Loops through until there are no more paths in the frontier.
      Mostly from Aaron Jay.
     */
    public void solve(int x, int y) {
	frontier = new queue();
	frontier.enqueue(x,y);
	while(!frontier.empty()) {
	    Node tmp = frontier.dequeue();
	    int xcoor = tmp.getX();
	    int ycoor = tmp.getY();
	    if (board[xcoor][ycoor] == exit) {
		System.out.println(this);
		System.exit(0);
	    }
	    board[xcoor][ycoor] = me;
	    if (checkAround(xcoor+1,ycoor)){
		frontier.enqueue(xcoor+1,ycoor);
	    }
	    if (checkAround(xcoor-1,ycoor)){
		frontier.enqueue(xcoor-1,ycoor);
	    }
	    if (checkAround(xcoor,ycoor+1)){
		frontier.enqueue(xcoor,ycoor+1);
	    }
	    if (checkAround(xcoor,ycoor-1)){
		frontier.enqueue(xcoor,ycoor-1);
	    }
	    System.out.println(this);
	    delay(10);
	}
    }
		
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}


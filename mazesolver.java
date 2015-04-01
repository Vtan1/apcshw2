/*
  Maze Solver
   -$ exit
   -# path
   -" " wall
   -z me
   -. visited
  -solved recursively in each possible direction
  -depth search first
   -go as far as you can with one path before using another path, no matter
    where the exit is.
  -recursion stack stored how to get back and where our divergent point was.

  Breadth Search First
  -explore a little around each step you take to make it more efficient if the
   answer is closer by.
  -when we code this letters on the board will be coordinates.
  -put the starting node on frontier and mark it as visited.
  -what we're really doing though is just enqueue(start node).
  -we look at the nodes adjacent to the starting node, then move on to those
   adjacent to those. We keep adding and and removing to the frontier(our stack)

  while (!q.empty()) :
    current = q.dequeue()
    if (Board[current.getx()][current.gety()] == exit) {
      for each unvisited neighbor of current:
        q.enqueue(n)
	}

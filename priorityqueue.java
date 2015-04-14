/*
  -in addition to adding each coordinate to the frontier, also has a priority 
   that allows the Nodes to be inserted into the list based on how close they 
   are to the exit. Closest one in front of the queue so that you search down 
   there first.
  -this is called best first search
   -when you add each node to the frontier, first assign a priority and then add
    to the frontier which is a priority queue (ordered list)
  -Maze Herristics:
   1. distance formula (Euclidean)
   2. manhattan (taxi cab) distance - adds horizontal and vertical distance
    -gives a relative approximation in a grid.

  -A* (slight modification of best first search)
   -priority of Node n = cost to get to node n + estimated distance to goal
   -slightly more efficient than best first search
   -used most in real life (cars and video games)

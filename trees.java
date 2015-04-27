/*

4/22/15
  Trees
  -specification of a Graph
  -a Graph is a collection of nodes(vertices) and edges
  -node ----> holds stuff
  -edge connects nodes together
  -weighted graph has numbers associated with each edge to indicate a sort of 
   priority.
  -directed graph has directions to get from node to node. Can have weights.

  -Definition 1: a tree is an acyclic graph with no node designated as a root.
  -acyclic means that there is no pointer back to the other nodes.
  -Definition 2: a tree is either empty or has one or more nodes. each node can
   have zero or more children and one node is designated as the root.
  -leaf is a node with 0 children.
  -siblings are children of the same parent.
  -ancestor is any node on the path from the node n to the root.
  -height is length of the tree, in terms of either nodes/edges.
  
  -binary trees ---> leaf or has one or two children
  -most similar to doublely linked list.

4/23/15
  -similar to doubley linked list in the computer, but visually different
   because it points downwards instead of left and right.
  -binary search tree is a binary tree such that given any node with value v,
   all the nodes in the left subtree have values less than v and all the nodes
   in the right subtree have values greater than 3.

   public class Node {
     private int data;
     private Node left,right;
     //get and set methods and constructors
   }

   Node search (Node T, int i) {
     while (T!=null) {
       int c = T.getData().compareTo(i);
       if (c > 0) {
         T=T.getRight();
       } else if (c < 0) {
         T=T.getLeft();
       } else {
         return T;
       }
     }
     return null;
   }

   insert
     if T==null
        print T to the node you're inserting

   insert as a new leaf
     >create new node n
     >search for the value of n, use a piggyback pointer so that you can go
      backwards.
     >when lead pointer (T) gets to null, piggyback (T2) will be at the node
      before insertion point.
     >insert new node to left or right of T2 as appropriate.

4/27/15
  -process node ----> adding to a string
  -starting node + traverse(left) + traverse(right)
 */

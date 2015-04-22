/*
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
 */

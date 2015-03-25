/*
  3/11/15
  Linked list is comprised of nodes that contain some data and information on
  how to get to the next node.
  -set of nodes and a way to get to the "start" node
  -can be circular for endless list.

  3/12/15
  To print out the entire linked list without using manually typing get methods:
  -while/for loop
    -loops using (tmp!=null)
    -tmp = tmp.getNext();
    
    for (tmp = n;tmp != null; tmp = tmp.getNext();) {
       System.out.println(tmp);
    }

  -for the add function in the LList code, we can add to the front of the list
   instead of the back. Inefficient to add to end if it's very long (only way to
   access it would be to go getNext over and over again. Same as above.
  
  3/23/15
  -java's linkedlist is a double linkedlist that can go forwards and backwards,
   which makes it more flexible.
  -can also make an endless loop in the linkedlist by setting the last node's 
   next to the start.
 */

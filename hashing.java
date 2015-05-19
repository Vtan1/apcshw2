/* 5/18/15
   Hashing/Hash tables
   -we want to store things in a table by index(array)
   -we have to take a unique ID and convert it into a table index to store it.
   -hash function h(x) is a mapping funtion.
    -it takes a piece of information and converts it into an index to our hash
     table.
   -Problem: multiple objects can hash to the same slot/index
    ---> clash/collision
   -Solution:
    -hash table's array has to be sufficiently large (sparesely populated)
    -hash function should do a good job distributing items in the table.

5/19/15
  -closed hashing
   -everything is stored in the array
   -collision: solutions?
    -rehashing - use secondary hash
    -linear probing - just shift the hashed thing to the next available slot.
    -leave space in the table using a multiplier to store "collisions."
  -insert function: expected O(1)
  -retrieval: expected O(1)

  -open hashing
   -each array element is a pointer to a linked list of values that hash to that
    element.
   -insertion: O(1)
    -in the linked list, add to the front of it to make it constant time.
   -retrieval: expected O(1), O(n) with respect to the length (n) of linked list
    at the current location.
*/

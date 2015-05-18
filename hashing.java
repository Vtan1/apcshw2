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
 */

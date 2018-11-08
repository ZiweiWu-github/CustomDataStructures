# CustomDataStructures

----
IteratorLinkedList (requires Node.java)

A LinkedList that also works as an Iterator. The purpose was to create a data structure that could move between previous and next elements with ease. ListIterator does provide this function, but it does not support concurrent modification. So, that means a new ListIterator would need to created every time my List was updated. 

This class was created with the above features in mind, implementing the List and Iterator interfaces. The plan was to implement the ListIterator interface instead of the Iterator interface, but ListIterator has a conflicting add(Object o) method, where the parameters are the same, but the return types are different.

Features:

Concurrent Modification
  - The iterator will not throw an exception because the list was modified after the iterator was created.
  - An iterator will not need to be recreated each time the list was modified.
  - This list can add and remove elements while in an enhanced for-loop, eliminating the need for a while-loop for an iterator.
  
    For example:
    
    for(Integer i: list){
    
     if(i==2)
     
       list.remove()
       
     }
  
Previous and Next Elements
  - Can move between next and previous elements with ease.
  - Can move the 'current' node to before the head (first), after the tail (last), or to an index of your choosing.

----

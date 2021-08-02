# Data Structures in Java
This repository include implementations of Vector, Linked List, Doubly Linked List, Queue, Stack and Set using Java and Clean Code principles.


## Vector
Vectors are kind of sequential storage structures. It means that the data are storage side by side into memory. It turns the access easy to be done, once you know the index of your wanted date.

These methods take time complexity:

* addAtFinal(Object object) - O(1) using an attribute totalItems
* addAnyPosition(int position, Object object) - O(n)
* getByPosition(int positionIndex) - O(1)
* remove(int positionIndex) - O(n)
* contain(Object object) - O(n)


## Linked List

Linked List are build using nodes, when each node contains at leat two attributes: data itself and next node reference. Therefore the addition operation turns quicker than the Vector's one, nevertheless the search operations turn slower once we have to range all positions (in worst case) to find your element.

These methods take time complexity:

* addAtFinal(Object object) - O(1)
* addAtBeginning(Object object) - O(1) 
* addAnyPosition(int position, Object object) - O(1)
* getByPosition(int positionIndex) - O(n)
* removeAtBeginning() - O(1)
* remove(int positionIndex) - O(n)
* contain(Object object) - O(n)

## Doubly Linked List

Similar as Linked List, but the nodes must have one more attribute: previous node reference. Then some operations will be easier, e.g. removeAtFinal(), once you won't have to range the whole list to find the previous neighbour of the last node.

These methods take time complexity:

* addAtFinal(Object object) - O(1)
* addAtBeginning(Object object) - O(1) 
* addAnyPosition(int position, Object object) - O(1)
* getByPosition(int positionIndex) - O(n)
* removeAtBeginning() - O(1)
* removeAtFinal() - O(1)
* remove(int positionIndex) - O(n)
* contain(Object object) - O(n)

## Stack

This structure takes whataever of Vectors or Linked Lists to be implemented. Allow us accumulate states, one on top of the other, and remove them using LIFO's rule: last in, first out.

- Pushes are made on top
- Removes are made on top

These methods take time complexity (using Linked List to implement):

* add(Object object) - O(1)
* remove() - O(1)
* isEmpty() - O(1)

## Queue

Queues are similar as stack, however insertions and removes are made using FIFO's rule: first in, first out. Generally, are implemented usign Linked Lists.

These methods take time complexity (using Linked List to implement):

* add(Object object) - O(1)
* remove() - O(1)
* isEmpty() - O(1)

## Set

In sets we don't have reapeted elements. So, every time we need to make a insertion, we have to search on whole structure if this element already exists. You are might thinking we must do a lot of searches and you're right. Therefore our search must be quick and we are using a Array List of Linked Lists (sort of Hash Table) to implemented this. The better our spreading function (hash fuction) is, better our search operation will perform.

These methods take time complexity (using Array List of Linked Lists to implement):

* add(Object object) - O(n) where n is the length of a line (Linked List)
* remove(Object object) - O(n)


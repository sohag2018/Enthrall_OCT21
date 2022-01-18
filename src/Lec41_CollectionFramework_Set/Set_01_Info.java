package Lec41_CollectionFramework_Set;
/*
Set: A Set is a Collection that ---> cannot contain duplicate elements. 
The Set interface contains only methods inherited from Collections and adds the restriction that duplicate elements are prohibited.


Implemented By HashSet Class
HashSet: 
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16

A list can contain duplicate elements whereas Set contains unique elements only.

HashSet uses HashMap internally to store it’s objects. 
Whenever you create a HashSet object, one HashMap object associated with it is also created. 
This HashMap object is used to store the elements you enter in the HashSet. The elements you add into HashSet are stored as keys of this HashMap object. The value associated with those keys will be a constant.

Class Plan: 
**********
-Regarding HashSet Info
-Create a class and show basic insert and retrieve, Print approach---debug and explain how data get inserted on the basis of hasing--hash code, initial capacity
-Create another class--show : unique element only, null value, no insertion order, printing approach, contains(), remove() etc
-create a class show--we can add arrayList as element in set ---
-create a program by using empty()+iterator.hasNext()+remove()---done

TreeSet
*******
---->Java TreeSet class maintains ascending order.
---->Java TreeSet class doesn't allow null element
Java TreeSet class implements the Set interface that uses a tree for storage
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class is non synchronized.

Class Plan:
-regarding TreeSet info
-Create Class--Show insertion and retrive, unique elements only, no null value, ascending order, ascending order (sorted)
-

LinkedHashSet
*************
Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
It inherits HashSet class and implements Set interface.
---->Java LinkedHashSet class maintains insertion order.
Java LinkedHashSet class contains unique elements only like HashSet.
Java LinkedHashSet class provides all optional set operation and permits null elements.
Java LinkedHashSet class is non synchronized.

Class Plan:
-regarding LinkedHashSet info
-Create Class--Show insertion and retrive, unique elements only, insertion order, null value, debug and show how HashTable and LinkedList implemented

* */






public class Set_01_Info {

}

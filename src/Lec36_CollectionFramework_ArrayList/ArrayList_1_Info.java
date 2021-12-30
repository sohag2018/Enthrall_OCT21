package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;

/*List Interface
->List interface is the child interface of Collection interface. 
->It inhibits a list type data structure in which we can store the ordered collection of objects. 
->It can have duplicate values.
->List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
To instantiate the List interface, we must use :
1.	List <data-type> list1= new ArrayList();  
2.	List <data-type> list2 = new LinkedList();  
3.	List <data-type> list3 = new Vector();  
4.	List <data-type> list4 = new Stack();  
There are various methods in List interface that can be used to insert, delete, and access the elements from the list.
The classes that implement the List interface are given below.





 
ArrayList Class
*****************************************************************
implements the List interface
uses a dynamic array
capacity:
Initial=10 (as using default constructor)
Formula to increase capacity: 
Old formula---> oldCapacity * 3/2) + 1 .  10-->16--->25 amd so on
In JDK 7 and above the formula changes to newCapacity = oldCapacity + (oldCapacity >> 1)
10--->15----->22------>33(need to check)

duplicate element
different data types (Heterogeneous elements are allowed)
maintains the insertion order (insertion order will be preserved ->will print as you add)
non-synchronized 
elements stored in the ArrayList class can be randomly accessed (by using get(index)
stores values in the basis of index
null insertion is possible (String)
 
Good to know:
->add(), size(), get()
->get all values by using for loop, iterator()
->generic and non generic
->user-defined class obj
->addAll()
->removeAll()
->retainAll()
->how array is fixed but ArrayList not
->why ArrayList is slow
*    in case of adding element and removing element🡪for shifting needs time
->ArrayList is better choice 
*for data retrieval 
   ar.get(0);----for example it will take 1 m.sec
   ar.get(1000)-- -- it will take 1 m.sec too
 
*/

/*Class Plan:
 * ---Introductory discussion about ArrayList
 * Array vs ArrayList
 * 
 * ---Showing array declaration vs Creating ArrayList Obj and adding value
 * adding obj, showing capacity, how to print arrayList, print specific value by index using get(), Print all values using loop,  using size() to get size 
 * 
 * ---Manipulation of data
 * add, print, add in specific position by using obj.add(1,"sss"), 
 * find index for specic obj, removing, addingall and removing all from prev arrayList, RetainAll() to remove which are not in list
 * 
 * 
 * --Heterogeneous type elements, duplicate element, print by using iterator()
 * 
 * ---Generic type
 * show non generic vs generic
 * 
 * --CustomizedClass type
 * create student class and get value for name variable by creating obj from CustomizedClass where need to show customized generic typ arrayList
 * 
 * --Adding elements from source
 * forloop, Random Class, Scanner class
 * 
 * */




public class ArrayList_1_Info {

	public static void main(String[] args) {
		
	}

}

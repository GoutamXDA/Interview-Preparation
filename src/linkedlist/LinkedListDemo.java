package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		
		
		list.remove(0);   //removes element which has 0 index here i.e 40
		list.removeFirst(); // 10 becomes that the 0 indexed element  here 10 is removed
		list.addLast(99);
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.contains(100)); // contains checks the given value present or not
		
		list.add(1);
		System.out.println(list);
		
		//to get first occurrence of element

		System.out.println(list.indexOf(1));  //gives index
		
		//size
		System.out.println(list.size()); //count of element present
		
		var array = list.toArray();
		System.out.println(Arrays.toString(array));
	}
}

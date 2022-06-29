package com.simplilearn.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//linkedlist is a part of the collection framework present in java.util package
		//it is linear datastructure type where elements are not stored in contiguous location
		//every element is a separate object with datapart and address part.
		//this elements are linked using pointer and addresses.
		//each element is called as node.
		//due to dynamicity and ease of insertion and deletions they are much more preferred than arrays
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		list.add(56);
		list.add(67);
		list.add(89);
		list.add(13);
		
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		
		list.remove(3);
		System.out.println(list);
		System.out.println("Element 2: "+list.get(2));
		
		list.add(2,0);
		
		System.out.println(list);
		
		System.out.println("First Element: "+list.getFirst());
		
		System.out.println("Last Element: "+list.getLast());
		
		///iterate linked list using foreach loop 
		
		//iterate linked list using iterator

	}

}

package com.simplilearn.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<String> list= new Vector<String>();
		
		//it is synchronized, it is slow because of synchronized
		//vector is legacy class
		//legacy class  - that formed the collection framework in the earlier versions of java and now 
		//being restructured or re-oriented
		
		
		//vector is special type of arraylist that defines a dynamic array. vector has several methods 
		//that are not present in the collection framework, but vector implements  iterable after the release of JDK 5
		//now we can use both for-each loop and iterable both
		
		System.out.println("Size: "+list.size());
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple"); 
		list.add(null); 
		
		
		System.out.println("After Adding Elements: "+list.size());
		System.out.println(list);
		
		System.out.println("Element at Index 4: " +list.get(4));
		list.add("Pizaa");
		System.out.println(list);
		
		
		System.out.println("list Contains Apple? "+list.contains("Apple"));
		
		list.remove(0);
		list.remove(null);
		System.out.println(list);
		
		
		
		//for each loop
		for(String s:list) {
			
			System.out.println("Using For Loop: "+s);
		}
		
		//iterate using iterator
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Using Iterator: "+itr.next());
		}
		
		
		
	}

}

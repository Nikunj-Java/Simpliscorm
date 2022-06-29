package com.simplilearn.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String>list= new ArrayList<String>();
		
		System.out.println("Size: "+list.size());
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple");//duplicates values are allowed
		list.add(null);//list contains null value
		
		
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

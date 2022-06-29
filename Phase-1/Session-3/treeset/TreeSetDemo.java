package com.simplilearn.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//tree set is one of the most imp implementation of sorted set interface in java
		//the ordering of the element is maintained by a set using their natural ordering
		
		//refe variable
		Set<String> set= new TreeSet<String>();
		
		set.add("Banana");
		set.add("Cherry");
		set.add("Almond");
		//set.add(null);  //null not allowed in treeset
		set.add("Apple");
		
		
		System.out.println("Size: "+set.size());
		System.out.println("TreeSet: "+set);
		System.out.println("Contains: "+set.contains("Banana"));
		
		//iterate using foreach loop
		
		//iterate using iterator
		
		
	}
}

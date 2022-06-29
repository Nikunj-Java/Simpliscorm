package com.simplilearn.hashset;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		//HashSet class implements Set Interface
		//no guarantee that the constant order of element over time
		//methods add,remove,contains, and size
		
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		set.add(20);
		set.add(55);
		set.add(2);
		set.add(36);
		set.add(67);
		set.add(null);
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains: "+set.contains(55));
		set.remove(null);
		
		System.out.println(set);
		
		
		///iterate using iterator
		
		//iterate using for each loop
		
	
	}

}

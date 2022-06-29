package com.simplilearn.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedhashSet is an ordered version of HashSet
		// whenever iteration order is needed to be maintained this class is used
		//Whene cycling through LinkedHasSet using Iterator, the elements will be--
		//returned in the order i which they were inserted
		//do not allow duplicate values
		
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		
		//Note: this will not add new elements as A is already exist
		linkedset.add("A");
		linkedset.add("E");
		linkedset.add(null);
		
		
		System.out.println("Size: "+linkedset.size());
		
		System.out.println(linkedset);
		
		System.out.println("Contains  E : "+linkedset.contains("E"));
		
		linkedset.remove(null);
		
		System.out.println("After Removing null "+linkedset);
		
		
		//iterate using foreach loop
		
		///iterate using iterator
		
		
		
		

	}

}

package com.simplilearn.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map= new Hashtable<Integer, String>();
		
		//null values are not allowed in Hashtable
		//insertion order is not maintained
		
		map.put(1, "Rorisang");
		map.put(2, "Clinthon");
		
		map.put(3, "Nikunj");//key and value both are not null
		//map.put(null, null); ///both key and value are null
		//map.put(null, "Soni");//key is null and value is not null
		//map.put(8, null);//key is not null but value is null
		
		System.out.println(map);
		
		System.out.println("Get Element at key 3: "+map.get(3));
		
		System.out.println("Get Element at key 5: "+map.get(5));
		
		map.remove(8);
		System.out.println(map);
		
		
		//iterate using for loop
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}

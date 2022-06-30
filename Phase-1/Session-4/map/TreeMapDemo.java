package com.simplilearn.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		 TreeMap<Integer, String> map =new TreeMap<Integer, String>();
		 
		 	//null key is not accepted in TreeMap but Null Value can be Accepted
		 	//treemap is implementation of map and sortedmap
		 	//it maintains insertion order
		    map.put(1, "Rorisang");
			map.put(2, "Clinthon");
			
			map.put(3, "Nikunj");//key and value both are not null
			//map.put(null, null); ///both key and value are null
			//map.put(null, "Soni");//key is null and value is not null
			map.put(8, null);//key is not null but value is null
			
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

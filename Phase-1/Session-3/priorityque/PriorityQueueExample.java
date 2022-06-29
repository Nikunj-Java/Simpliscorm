package com.simplilearn.priorityque;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(21);
		pq.add(12);
		
		System.out.println("PriorityQueu: "+pq);
		
		System.out.println("Element at the Top Position: "+pq.peek());
		
		System.out.println("Print and Remove TOp Element: "+pq.poll());
		
		System.out.println("PriorityQueu after poll: "+pq);
		
		System.out.println("Element at the Top Position: "+pq.peek());
		
		
		System.out.println("Removeing element 21: "+pq.remove(21));
		
		System.out.println("PriorityQueu after removing 21: "+pq);
		
		
		for(Integer s:pq) {
			
			System.out.println("Using For each Loop: "+s);
		}
		
		
		//iterate using iterator
		Iterator<Integer> itr=pq.iterator();
				
				while(itr.hasNext())
				{
					System.out.println("Using Iterator: "+itr.next());
				}
		}
		 
	
	

}

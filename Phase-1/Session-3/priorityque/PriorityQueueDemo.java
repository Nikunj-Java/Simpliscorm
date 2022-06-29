package com.simplilearn.priorityque;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	
	public static void main(String[] args) {
		//priorityQueue doesn't allow null
		//we can't create priority quueue that are non -camparable
		//que retrival operations poll, remove ,peek
		//it follows  ascending order in integer
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>();
		
		//adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(12);
		
		//print priorityQueue
		
		System.out.println(pQueue);
		
		//printing the top elements of priorityqueue
		System.out.println("Top Element: "+pQueue.peek());
		
		//printing the top element and removing it from the priority queue container
		System.out.println("Printing the top element and removing: "+pQueue.poll());
		
		
		//printing the top element again
		System.out.println("Top Element: "+pQueue.peek());
		
		
		//remove element from pQueue
		pQueue.remove(15);
		
		System.out.println("After Remove: "+pQueue);
		
		for(Integer s:pQueue) {
			
			System.out.println("Using For each Loop: "+s);
		}
		
		
		//iterate using iterator
		Iterator<Integer> itr=pQueue.iterator();
				
				while(itr.hasNext())
				{
					System.out.println("Using Iterator: "+itr.next());
				}
	}

}

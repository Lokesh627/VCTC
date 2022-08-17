package xyz;

import java.util.PriorityQueue;

public class Priorityqueuestudy {

	public static void main(String[] args)
	{
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("Velocity");
		pq.add("Corporate");
		pq.add("Shubham");
		pq.add("Training");
		pq.add("Centre");
		pq.add("Pune");
		
		
		System.out.println(pq);
		
		
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println(pq.peek());		//Only retrieves the value//
		System.out.println(pq);
		System.out.println(pq.poll());		//Retrieves and removes the value//
		System.out.println(pq);
		System.out.println("Remove method "+pq.remove());
		System.out.println("Remove method "+pq.remove());
		pq.poll();
		System.out.println(pq);
	}

}

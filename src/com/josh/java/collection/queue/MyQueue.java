package com.josh.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		// Creating an object of LikedList to store the values in queue order
		Queue<Integer> values = new LinkedList<>();
		values.add(10);
		values.add(30);
		values.add(20);
		values.add(40);
		values.add(50);
		// This will print the entire data
		System.out.println("Queue :" + values);
		// peek() method is used to get the head value from the list and it does not
		// delete the value
		System.out.println("Queue :" + values.peek());
		// poll() method is used to get the head value from the list and it will delete
		// the head value
		System.out.println("Queue :" + values.poll());

		// printing all the elements of the queue
		System.out.println("Queue :" + values);

	}
}

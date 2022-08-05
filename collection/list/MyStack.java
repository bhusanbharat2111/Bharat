package com.josh.java.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
	public static void main(String[] args) {

		Stack<String> myStack = new Stack<String>();

		// Items are added on top
		myStack.push("Sunday");
		myStack.push("Monday");
		myStack.push("Tuesday");
		myStack.push("Wednesday");
		myStack.push("Thursday");
		myStack.push("Friday");
		myStack.push("Saturday");

		// Size of the stack
		System.out.println("weekdays : " + myStack.size());

		// Removing an elements
		String item = myStack.pop();
		System.out.println("Removed item {" + item + "} from the queue");

		// Accessing elements in a stack
		System.out.println("\nElements left in MyStack : ");
		Iterator itor = myStack.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}

	}
}

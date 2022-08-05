package com.josh.java.collection.list;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		// creating LinkedList object
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// adding elements to LinkedList
		linkedList.add(55);
		linkedList.add(111);
		linkedList.add(222);
		linkedList.addLast(99);
		linkedList.addFirst(11);
		System.out.println("After some operation:..............\n" + linkedList);

		// removing one element
		linkedList.remove(2);
		System.out.println("\nAfter removing an element:..............\n" + linkedList);

		// again added one element
		linkedList.add(653);
		System.out.println("\nAfter adding one element:..............\n" + linkedList);
	}

}

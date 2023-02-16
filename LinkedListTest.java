package com.monocept.test;

import com.monocept.model.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("Link list is");
		list.printList();
		list.delete(6);
		System.out.println("\nAfter deleting last element list is ");
		list.printList();
		list.add(6);
		list.delete(1);
		System.out.println("\nAfter deleting first element list is ");
		list.printList();
		
	}

}

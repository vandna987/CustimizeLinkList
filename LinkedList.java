package com.monocept.model;

public class LinkedList {
	Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public Node add(int data) {
		Node new_node = new Node(data);

		Node temp = null;

		if (this.head == null) {
			this.head  = new_node;
		} else {
			temp=this.head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=new_node;
			}
		return this.head;
	}
	public Node delete(int key) {
		Node currNode = this.head, prev = null;
  
        if (currNode != null && currNode.data == key) {
            this.head = currNode.next; // Changed head
        }
        else {
        	while(currNode.data!=key) {
        		prev = currNode;
        		currNode = currNode.next;
        	}
        	prev.next=currNode.next;
        }
            return this.head;
	}

	public void printList() {
		Node currNode = this.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}
}

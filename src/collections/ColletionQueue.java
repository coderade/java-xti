package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ColletionQueue {

	public static void main(String[] args)
	{
		Queue<String> queue = new LinkedList<>();//LinkedList - Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and permits all elements (including null).
		queue.add("Google");
		queue.add("Microsoft");
		queue.add("Apple");
		queue.add("Oracle");
		System.out.println(queue.toString());
		
		System.out.println(queue.peek());//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
		queue.poll();//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println(queue.peek());
		System.out.println(queue.toString());
		
		LinkedList<String> q = (LinkedList<String>) queue;
		q.addFirst("IBM");//Inserts the specified element at the beginning of this list
		q.addLast("Yahoo!");//Appends the specified element to the end of this list. 

		System.out.println(queue);
		
		System.out.println(q.peekFirst());//Retrieves, but does not remove, the first element of this list, or returns null if this list is empty
		System.out.println(q.peekLast());//Retrieves, but does not remove, the last element of this list, or returns null if this list is empty
		q.pollFirst();//Retrieves and removes the first element of this list, or returns null if this list is empty.
		q.pollLast();//Retrieves and removes the last element of this list, or returns null if this list is empty
		System.out.println(queue.toString());
	}

}

package textgen;

import com.sun.javaws.exceptions.ErrorCodeResponseException;
import org.reactfx.util.LL;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
		size = 0;
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element )
	{
		// TODO: Implement this method
		LLNode<E> newNode = new LLNode<E>(element);
		tail.prev.next = newNode;
		newNode.prev = tail.prev;
		newNode.next = tail;
		tail.prev = newNode;
		this.size++;
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		if (index > this.size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}

		int i = 0;
		LLNode<E> p = head;
		while( (p = p.next) != tail) {
			if (i == index) {
				break;
			}
			i += 1;
		}

		return p.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		if (index < 0 || index > this.size ) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}

		if (index == this.size) {
			this.add(element);
			return;
		}

		LLNode p = head;

		LLNode<E> newNode = new LLNode<E>(element);
		int count = 0;
		while((p = p.next) != tail) {
			if (count == index) {
				break;
			}
			count++;
		}
		p.next.prev = newNode;
		newNode.prev = p;
		newNode.next = p.next;
		p.next = newNode;
		this.size++;
	}


	/** Return the size of the list */
	public int size() 
	{
		return this.size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		if (index <= -1 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
//		if (index == 0) {
//			removeNode = head.next;
//			head.next = removeNode.next;
//			removeNode.next.prev = head.next;
//			return removeNode.data;
//		}
//
//		 else if (index == this.size - 1) {
//			removeNode = tail.prev;
//			removeNode.prev.next = null;
//			removeNode.prev = null;
//			return removeNode.data;
//		}

		else {
			LLNode<E> removeNode = head;
			int i  = 0;
			while ((removeNode = removeNode.next) != tail) {
				if (i == index) {
					removeNode.prev.next = removeNode.next;
					removeNode.next.prev = removeNode.prev;
					removeNode.next = null;
					removeNode.prev = null;
					this.size--;
					break;
				}
				i++;
			}
			return removeNode.data;
		}

	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	// set new value for list element
	public E set(int index, E element) 
	{
	   	LLNode<E> p = head;
	   	if (index >= this.size || index <= -1) {
	   		throw new IndexOutOfBoundsException("Index out of bound");
		}
		int i = 0;
	   	while((p = p.next) != tail) {
	   		if (index == i) {
	   			p.data = element;
	   			break;
			}
			i++;
		}
		return p.data;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}

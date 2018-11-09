package Stack;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * An interface for a Stack, because Java's implementation of a Stack is deprecated.
 * @author Ziwei Wu
 * @param <E> - The type of element that the stack will contain.
 */
public interface Stack<E> {
	
	/**
	 * Pushes an object onto the stack.
	 * @param e The object to be pushed on the stack.
	 * @throws NullPointerException if the implementation does not allow for null elements
	 * 	and the element is null.
	 */
	public void push(E e);
	
	/**
	 * Removes and returns the last element that was pushed.
	 * @return The last element that was pushed.
	 * @throws NoSuchElementException if the stack is empty
	 */
	public E pop();
	
	/**
	 * Returns, but does not remove the last element pushed.
	 * @return The last element that was pushed.
	 * @throws NoSuchElementException if the stack is empty
	 */
	public E peek();
	
	/**
	 * Returns true if the stack is empty.
	 * @return true if the stack is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the size of the stack.
	 * @return the size of the stack.
	 */
	public int size();
	
	/**
	 * Pushes all of the elements from the collection into the stack. The first element of
	 * the collection will be pushed first.
	 * @param c - Collection containing elements to be pushed onto the stack.
	 * @throws ClassCastException if the class of an element of the specified collection prevents it
	 * 	from being pushed to this stack
	 * @throws NullPointerException if the specified collection contains one or more null elements
	 * 	and this stack does not permit null elements, or if the specified collection is null
	 * @throws IllegalArgumentException if some property of an element of the specified collection 
	 * 	prevents it from being added to this stack
	 */
	public void pushAll(Collection<? extends E> c);

	/**
	 * Completely clears the stack
	 */
	public void clear();
}

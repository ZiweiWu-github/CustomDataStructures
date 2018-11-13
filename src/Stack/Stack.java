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
	 * Pushes all of the elements from the collection into the stack starting from the first element
	 * of the Collection.
	 * @param c - Collection containing elements to be pushed onto the stack.
	 */
	public void pushAll(Collection<? extends E> c);

	/**
	 * Pushes all of the elements from the collection into the stack starting from the last element
	 * of the Collection.
	 * @param c
	 */
	public void pushAllReverse(Collection<? extends E> c);
	
	/**
	 * Completely clears the stack
	 */
	public void clear();
	
	/**
	 * Returns the stack as an array. Note: the last element pushed will be the first element.
	 * @return An Object array containing the elements of the stack
	 */
	public Object[] toArray();
	
	/**
	 * Returns the stack as an array of Type T. Note: the last element pushed will be the 
	 * first element.
	 * <p>If the array is too small, then a new array will be created with the proper size.
	 * <p>If the array is bigger than the amount of elements this stack contains, then the 
	 * element immediately following the last element will be null.
	 * @param a - an Array of Type T.
	 * @return An array of type T containing the elements of the stack
	 */
	public <T>T[] toArray(T[] a);
}

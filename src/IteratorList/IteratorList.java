package IteratorList;
import java.util.Iterator;
import java.util.List;

/**
 * This interface contains the methods of Iterator and List along with custom methods of my own.
 * @author Ziwei Wu
 * @param <E> - The type of element this list/iterator will contain.
 */
public interface IteratorList<E> extends List<E>, Iterator<E> {
	
	/**
	 * Returns true if the current node has a previous node.
	 * @return true if there is a previous node
	 */
	public boolean hasPrevious();
	
	/**
	 * Returns the element that is in the previous node.
	 * @return the previous node's element
	 */
	public E previous();
	
	/**
	 * Puts the 'current' node right before the head (first) node
	 * To get the first element, call {@code next()}
	 * @see #tailStart()
	 * @see #moveToIndex(int)
	 */
	public void headStart();
	
	/**
	 * Puts the 'current' node right after the tail (last) node
	 * To get the last element, call {@code previous()}
	 * @see #headStart()
	 * @see #moveToIndex(int)
	 */
	public void tailStart();
	
	/**
	 * Moves the 'current' node to the index.
	 * @param index - the index the current node will move to
	 * @see #tailStart()
	 * @see #headStart()
	 */
	public void moveToIndex(int index);
	
	/**
	 * Removes all instances of the object that is passed in from this list.
	 * Created because {@code remove(Object o)} only removes the first instance
	 * of the object.
	 * @param o - the object to be removed
	 * @return true if this list contained the object
	 * @see #remove(Object)
	 */
	public boolean removeAllInstances(Object o);
}

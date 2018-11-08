
public class Node<E> {
	private E element;
	private Node<E> previous, next;
	public Node(E e) {
		element = e;
	}
	public E get() {
		return element;
	}
	public void set(E e) {
		element = e;
	}
	public void setNext(Node<E> n) {
		next = n;
	}
	public void setPrevious(Node<E> p) {
		previous = p;
	}
	public Node<E> next(){
		return next;
	}
	public Node<E> previous(){
		return previous;
	}
	public boolean hasNext() {
		return next != null;
	}
	public boolean hasPrevious() {
		return previous != null;
	}
	public void clear() {
		next = null;
		previous = null; 
		element = null;
	}
}

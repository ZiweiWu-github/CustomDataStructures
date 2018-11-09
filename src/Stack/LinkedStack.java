package Stack;

import java.util.Collection;
import java.util.NoSuchElementException;

import Node.Node;

/**
 * An implementation of {@code Stack<E>} using {@code Node<E>}
 * @author Ziwei Wu
 * @param <E> - The type of element the stack will contain.
 */
public class LinkedStack<E> implements Stack<E>{
	private Node<E> last;
	private int size;
	
	@Override
	public void push(E e) {
		if(last == null) {
			last = new Node<>(e);
		}
		else {
			Node<E> temp = new Node<>(e);
			temp.setPrevious(last);
			last = temp;
		}
		size++;
	}

	@Override
	public E pop() {
		if(last == null)
			throw new NoSuchElementException();
		E e = last.get();
		Node<E> temp = last;
		last = last.previous();
		temp.clear();
		size--;
		return e;
	}

	@Override
	public E peek() {
		if(last == null)
			throw new NoSuchElementException();
		return last.get();
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void pushAll(Collection<? extends E> c) {
		for(E e: c) {
			push(e);
		}
	}

	@Override
	public void clear() {
		while(last != null) {
			Node<E> temp = last;
			last = last.previous();
			temp.clear();
		}
		size = 0;
	}

}

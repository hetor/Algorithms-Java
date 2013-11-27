/**   
 * Description: 
 * 链栈
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013年9月29日 下午2:40:15 
 * @version V1.0
 */
package stack;

public class LinkedStack<E> {

	private Node<E> front;
	
	public LinkedStack() {
		front = null;
	}
	
	public void push(E e) {
		Node<E> n = new Node<E>(e, front);
		front = n;
	}
	
	public E pop() {
		Node<E> f = front;
		E e = f.e;
		front = f.next;
		f.e = null;
		f.next = null; //help GC
		return e;
	}
	
	public E getTop() {
		return front.e;
	}
	
	public int getSize() {
		Node<E> n = front;
		int i=0;
		while(null != n){
			++i;
			n = n.next;
		};
		return i;
	}
	
	public boolean isEmpty() {
		return null == front;
	}
	
	private static class Node<T> {
		T e;
		Node<T> next;
		
		public Node(T e, Node<T> next) {
			this.e = e;
			this.next = next;
		}
	}
}

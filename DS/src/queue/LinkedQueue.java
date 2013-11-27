package queue;

import common.Element;

/**
 * 链式存储的链表
 * front节点指向首节点为空，不存放数据
 * @author hetor
 * @param <E>
 */
public class LinkedQueue<E> {
	
	private Node<E> front;
	private Node<E> rear;
	private int size;
	
	public LinkedQueue() {
		front = rear = new Node<E>(null, null);
		size = 0;
	}
	
	public int enQueue(E e) {
		if(null == e) {
			return -1;
		}
		Node<E> node = new Node<>(e, null);
		rear.next = node;
		rear = rear.next;
		size++;
		return 0;
	}
	
	public E deQueue() {
		if(isEmpty()) {
			return null;
		}
		E e = front.next.e;
		if(front.next == rear) {
			rear = front;
		}
		front.next = front.next.next;
		size--;
		return e;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public int getSize() {
		return size;
	}
	
	public void traverse() {
		Node<E> p = front.next;
		System.out.println(">==");
		while(p != null) {
			System.out.print(p.e + " ");
			p = p.next;
		}
		System.out.println("<==");
	}
	
	/**
	 * Node
	 */
	private static class Node<T> {
		T e;
		Node<T> next;
		
		public Node(T e, Node<T> next) {
			this.e = e;
			this.next = next;
		}
	}
	
	/**
	 * test
	 */
	public static void main(String[] args) {
		LinkedQueue<Element> linkedQueue = new LinkedQueue<>();
		int i=0, j=0;
		while(i++<10) {
			linkedQueue.enQueue(new Element(i));
		}
		
		while(j++<11) {
			linkedQueue.deQueue();
		}
		
		linkedQueue.traverse();
	}
}

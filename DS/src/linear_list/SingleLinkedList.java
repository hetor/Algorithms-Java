package linear_list;
/**   
 * Description: 
 * 单链表
 * Copyright (c) 2013
 * @author hetao  
 * @date 2013年9月29日 下午2:52:42 
 * @version V1.0
 */
public class SingleLinkedList<E> {
	
	private Node<E> head;
	
	public SingleLinkedList() {
		head = null;
	}
	
	@SuppressWarnings("unchecked")
	public SingleLinkedList(E... es) {
		if(null == es || es.length <= 0) {
			head = null;
			return;
		}
		Node<E> p;
		for(E e : es) {
			Node<E> node = new Node<E>(e, null);
			p = head;
			head = node;
			head.next = p;
		}
	}
	
	public int insert(E e) {
		if(null == e) {
			return -1;
		}
		Node<E> node = new Node<E>(e, null);
		Node<E> n = head;
		head = node;
		head.next = n;
		return 0;
	}
	
	/**
	 * �ݹ����õ�����
	 */
	public void reserveWithRecursion() {
		reserveWithRecursion(head);
	}
	
	private void reserveWithRecursion(Node<E> node) {
		if(null == node || null == node.next) {
			head = node;
			return;
		}
		reserveWithRecursion(node.next);
		node.next.next = node;
		node.next = null;
	}
	
	/**
	 * �ǵݹ����õ�����
	 */
	public void reserve() {
		if(null == head || null == head.next) {
			return;
		}
		Node<E> n0 = head;
		Node<E> n1 = head.next;
		Node<E> n2 = head.next.next;
		head.next = null;
		while(null != n2) {
			n1.next = n0;
			n0 = n1;
			n1 = n2;
			n2 = n2.next;
		}
		n1.next = n0;
		head = n1;
	}
	
	public E getHead() {
		return head.e;
	}
	
	public void traverse() {
		Node<E> n = head;
		while(null != n) {
			System.out.print(n.e + " ");
			n = n.next;
		}
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

package tree;

import common.IFactory;
import queue.LinkedQueue;
import stack.ArrayStack;

/**
 * 二叉树
 * @author hetao
 * @param <E>
 */
public class BiTree<E> {

	private Node<E> root;
	
	public BiTree(IFactory<E> ef) {
		root = createBiTree(ef);
	}
	
	public E getRoot() {
		return root.e;
	}
	
	public Node<E> createBiTree(IFactory<E> ef) {
		E e = ef.newInstance();
		if(null == e) {
			return null;
		}
		Node<E> n = new Node<E>(e, null, null);
		n.left = createBiTree(ef);
		n.right = createBiTree(ef);
		return n;
	}
	
	public void preOrderTraverse() {
		preOrderTraverse(root);
	}
	
	private void preOrderTraverse(Node<E> node) {
		if(null == node) {
			return;
		}
		System.out.print(node.e + " ");
		preOrderTraverse(node.left);
		preOrderTraverse(node.right);
	}
	
	public void inOrderTraverse() {
		inOrderTraverse(root);
	}
	
	private void inOrderTraverse(Node<E> node) {
		if(null == node) {
			return;
		}
		inOrderTraverse(node.left);
		System.out.print(node.e + " ");
		inOrderTraverse(node.right);
	}
	
	public void inOrderTraverseNonRecursive() {
		Node<E> node = root;
		ArrayStack<Node<E>> s = new ArrayStack<>();
		while(null != node) {
			s.push(node);
			node = node.left;
		}
		while(!s.isEmpty()) {
			Node<E> n = s.pop();
			System.out.print(n.e + " ");
			n = n.right;
			while(null != n) {
				s.push(n);
				n = n.left;
			}
		}
	}
	
	public void postOrderTraverse() {
		postOrderTraverse(root);
	}
	
	private void postOrderTraverse(Node<E> node) {
		if(null == node) {
			return;
		}
		postOrderTraverse(node.left);
		postOrderTraverse(node.right);
		System.out.print(node.e + " ");
	}
	
	public void levelOrderTraverse() {
		LinkedQueue<Node<E>> queue = new LinkedQueue<>();
		queue.enQueue(root);
		while(!queue.isEmpty()) {
			Node<E> node = queue.deQueue();
			System.out.print(node.e + " ");
			queue.enQueue(node.left);
			queue.enQueue(node.right);
		}
	}
	
	public int depthBiTree() {
		return depth(root);
	}
	
	private int depth(Node<E> node) {
		if(null == node) {
			return 0;
		}
		int left = depth(node.left);
		int right = depth(node.right);
		return left >= right ? ++left : ++right;
	}
	
	/**
	 * Node
	 */
	private static class Node<T> {
		T e;
		Node<T> left;
		Node<T> right;
		
		public Node(T e, Node<T> left, Node<T> right) {
			this.e = e;
			this.left = left;
			this.right = right;
		}
	}
}

package queue;

import common.Element;

public class LoopArrayQueue<E> {

	private Object[] objs;
	private static final int DEFAUL_SIZE = 10;
	private int front, rear;
	
	public LoopArrayQueue() {
		this(DEFAUL_SIZE);
	}
	
	public LoopArrayQueue(int initQueSize) {
		objs = new Object[initQueSize]; //不支持直接new E[initQueSize]
		front = rear = 0;
	}
	
	public int enQueue(E e) {
		if(null == e) {
			return -2;
		}
		if((rear+1)%objs.length == front) {
			return -1;
		}
		objs[rear] = e;
		rear = (rear+1)%objs.length;
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public E deQueue() {
		if(front == rear) {
			return null;
		}
		E e = (E) objs[front];
		objs[front] = null;
		front = (front+1)%objs.length;
		return e;
	}
	
	public void clear() {
		for(int i=front; i<rear; i++) {
			objs[i] = null;
		}
		front = rear = 0;
	}
	
	public void traverse() {
		System.out.println(">==");
		for(int i=front; i!=rear; i=(i+1)%objs.length) {
			System.out.print(objs[i] + ", ");
		}
		System.out.println("<==");
	}
	
	public int queueLength() {
		 return (rear - front + objs.length)%objs.length;
	}
	
	/**
	 * test
	 */
	public static void main(String[] args) {
		LoopArrayQueue<Element> loopArrayQueue = new LoopArrayQueue<>();
		loopArrayQueue.traverse();
		int i=0, j=0, k=0; 
		while(i++ < 5) {
			loopArrayQueue.enQueue(new Element(i));
		}
		loopArrayQueue.traverse();
		while(j++ < 2) {
			loopArrayQueue.deQueue();
		}
		loopArrayQueue.traverse();
		while(k++ < 6) {
			loopArrayQueue.enQueue(new Element(k));
		}
		loopArrayQueue.traverse();
		loopArrayQueue.deQueue();
		loopArrayQueue.deQueue();
		loopArrayQueue.traverse();
	}
}


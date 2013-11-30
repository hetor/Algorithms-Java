package queue;

import common.Element;

public class ArrayQueue<E> {

	 private Object[] objs;
	 private static final int DEFAULT_SIZE = 10;
	 private int front;
	 private int rear;
	 
	 public ArrayQueue() {
		 this(DEFAULT_SIZE);
	 }
	 
	 public ArrayQueue(int initQueSize) {
		 objs = new Object[initQueSize]; //new E[initQueSize] is not supported
		 front = rear = 0;
	 }
	 
	 public int enQueue(E e) {
		 if(null == e) {
			 return -2;
		 }
		 if(rear >= objs.length) {
			 return -1;
		 }
		 objs[rear++] = e;
		 return 0;
	 }
	 
	 @SuppressWarnings("unchecked")
	 public E deQueue() {
		 if(front == rear) {
			 return null;
		 }
		 E e = (E) objs[front];
		 objs[front++] = null;
		 return e;
	 }
	 
	 public void clear() {
		 for(int i=front; i<rear; i++) {
			 objs[i] = null;
		 }
		 front = rear = 0;
	 }
	 
	 public int queueLength() {
		 return rear - front;
	 }
	 
	 public void traverse() {
		 System.out.println(">==");
		 for(int i=front; i<rear; i++) {
			 System.out.print(objs[i] + ", ");
		 }
		 System.out.println("<==");
	 }
	 
	 /**
	  * test
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayQueue<Element> arrayQueue = new ArrayQueue<>();
		arrayQueue.traverse();
		for(int i=0; i<5; i++) {
			arrayQueue.enQueue(new Element(i));
		}
		arrayQueue.traverse();
		for(int i=0; i<2; i++) {
			arrayQueue.deQueue();
		}
		arrayQueue.traverse();
	}
	 
}

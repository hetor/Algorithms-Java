/**   
 * Description: 
 * 顺序栈
 * 设置top指针，约定top=0时栈为空
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013年9月29日 下午2:40:03 
 * @version V1.0
 */
package stack;

import java.util.Arrays;

public class ArrayStack<E> {

	private Object[] objs;
	private static final int DEFAULT_SIZE = 10;
	private int top;
	
	public ArrayStack() {
		this(DEFAULT_SIZE);
	}
	
	public ArrayStack(int size) {
		objs = new Object[size];
		top = 0;
	}
	
//	public static <T> ArrayStack<T> newInstance() {
//		return newInstance(DEFAULT_SIZE);
//	}
//	
//	public static <T> ArrayStack<T> newInstance(int initSize) {
//		return new ArrayStack<T>(initSize);
//	}
	
	public boolean push(E e) {
		ensureCapacity();
		objs[top++] = e;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		E e = (E) objs[top-1];
		objs[top-1] = null; //let GC work
		top--;
		return e;
	}
	
	@SuppressWarnings("unchecked")
	public E getTop() {
		if(isEmpty()) {
			return null;
		}
		return (E) objs[top-1];
	}
	
	public int getStackLength() {
		return top;
	}
	
	public void ensureCapacity() {
		if(top == objs.length) {
			objs = Arrays.copyOf(objs, objs.length << 1);
		}
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
}

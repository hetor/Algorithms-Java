/**   
 * Description: 
 * TODO(用一句话描述该文件做什么) 
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013年9月29日 下午7:25:57 
 * @version V1.0
 */
package z.test.stack;

import common.Element;
import stack.LinkedStack;

public class UseLinkedStack {

	public static void main(String[] args) {
		LinkedStack<Element> ls = new LinkedStack<Element>();
		for(int i=0; i<10; i++) {
			ls.push(new Element(i));
		}
		System.out.println("栈顶：" + ls.getTop());
		System.out.println("链栈长度：" + ls.getSize());
		while(!ls.isEmpty()) {
			System.out.print(ls.pop() + " ");
		}
		System.out.println("\n链栈长度：" + ls.getSize());
	}
}

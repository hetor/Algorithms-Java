/**   
 * Description: 
 * TODO(��һ�仰�������ļ���ʲô) 
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013��9��29�� ����7:25:57 
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
		System.out.println("ջ����" + ls.getTop());
		System.out.println("��ջ���ȣ�" + ls.getSize());
		while(!ls.isEmpty()) {
			System.out.print(ls.pop() + " ");
		}
		System.out.println("\n��ջ���ȣ�" + ls.getSize());
	}
}

/**   
 * Description: 
 * TODO(��һ�仰�������ļ���ʲô) 
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013��9��29�� ����3:56:17 
 * @version V1.0
 */
package z.test.stack;

import common.Element;
import stack.ArrayStack;

public class UseArrayStack {

	public static void main(String[] args) {
		ArrayStack<Element> as = new ArrayStack<Element>();
		for(int i=0; i<12; i++) {
			as.push(new Element(i));
		}
		System.out.println("ջ����" + as.getTop());
		System.out.println("\n��ջ���ȣ�" + as.getStackLength());
		while(!as.isEmpty()) {
			System.out.print(as.pop() + " ");
		}
		System.out.println("\n��ջ���ȣ�" + as.getStackLength());
	}
}

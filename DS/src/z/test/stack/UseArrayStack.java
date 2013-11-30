/**   
 * Description: 
 * TODO(用一句话描述该文件做什么) 
 * Copyright (c) 2013
 * @author hetao  
 * @date 2013年9月29日 下午3:56:17 
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
		System.out.println("栈顶：" + as.getTop());
		System.out.println("\n链栈长度：" + as.getStackLength());
		while(!as.isEmpty()) {
			System.out.print(as.pop() + " ");
		}
		System.out.println("\n链栈长度：" + as.getStackLength());
	}
}
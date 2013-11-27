/**   
 * Description: 
 * ����������
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013��9��30�� ����3:49:07 
 * @version V1.0
 */
package linked_ist;

import common.Element;

import linear_list.SingleLinkedList;

public class ReverseSingleLinkedList {

	public static void main(String[] args) {
		Element[] es = new Element[10];
		for(int i=0; i<es.length; i++) {
			es[i] = new Element(i);
		}
		SingleLinkedList<Element> sll = new SingleLinkedList<>(es);
		sll.traverse();
		System.out.println();
		sll.reserve();
		sll.traverse();
		System.out.println();
		sll.reserveWithRecursion();
		sll.traverse();
	}
}

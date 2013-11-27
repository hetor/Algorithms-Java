package z.test.tree;

import java.util.Scanner;

import tree.BiTree;
import common.Element;
import common.IFactory;

/**
 * 0 1 2 -1 -1 3 4 -1 -1 -1 5 -1 -1
 * @author hetor
 */
public class UseBiTree implements IFactory<Element>{
	
	private Scanner scn;
	
	public static void main(String[] args) {
		BiTree<Element> biTree = new BiTree<>(new UseBiTree());
		System.out.print("\n�������ĸ���" + biTree.getRoot());
		System.out.print("\n���������������");
		biTree.preOrderTraverse();
		System.out.print("\n���������������");
		biTree.inOrderTraverse();
		System.out.print("\n���������������");
		biTree.postOrderTraverse();
		System.out.print("\n���������������");
		biTree.levelOrderTraverse();
		System.out.print("\n�ǵݹ����������������");
		biTree.inOrderTraverseNonRecursive();
		System.out.print("\n����������ȣ�" + biTree.depthBiTree());
	}

	@Override
	public Element newInstance() {
		if(null == scn) {
			scn = new Scanner(System.in);
		}
		int v = scn.nextInt();
		if(-1 == v) { //-1��ʾ�������
			return null;
		}
		return new Element(v);
	}
}

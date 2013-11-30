package z.test.tree;

import java.util.Scanner;

import tree.BiTree;
import common.Element;
import common.IFactory;

/**
 * 0 1 2 -1 -1 3 4 -1 -1 -1 5 -1 -1
 * @author hetao
 */
public class UseBiTree implements IFactory<Element>{
	
	private Scanner scn;
	
	public static void main(String[] args) {
		BiTree<Element> biTree = new BiTree<>(new UseBiTree());
		System.out.print("\n二叉树的根：" + biTree.getRoot());
		System.out.print("\n先序遍历二叉树：");
		biTree.preOrderTraverse();
		System.out.print("\n中序遍历二叉树：");
		biTree.inOrderTraverse();
		System.out.print("\n后序遍历二叉树：");
		biTree.postOrderTraverse();
		System.out.print("\n层序遍历二叉树：");
		biTree.levelOrderTraverse();
		System.out.print("\n非递归中序遍历二叉树：");
		biTree.inOrderTraverseNonRecursive();
		System.out.print("\n二叉树的深度：" + biTree.depthBiTree());
	}

	@Override
	public Element newInstance() {
		if(null == scn) {
			scn = new Scanner(System.in);
		}
		int v = scn.nextInt();
		if(-1 == v) { //-1表示输入结束
			return null;
		}
		return new Element(v);
	}
}
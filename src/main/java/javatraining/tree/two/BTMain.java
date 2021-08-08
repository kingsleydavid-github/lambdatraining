package javatraining.tree.two;

public class BTMain {

	public static void main(String[] args) {
		
		Integer[] t = {1,4,6,32,2,5,7,3,6};
		
		BinaryTree bt = new BinaryTree();
		
		for(Integer el : t) {
			bt.addElement(el);
		}
		
		System.out.println("In-Order");
		bt.inOrder(bt.getRoot());
		System.out.println("Pre-Order");
		bt.preOrder(bt.getRoot());
		System.out.println("Post-Order");
		bt.postOrder(bt.getRoot());
		
		//Sample s 
		
	}
	
	static class Sample{
		
		public void test() {
			System.out.println("abc");
		}
		
	}
}

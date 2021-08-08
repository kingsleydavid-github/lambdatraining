package javatraining.algo.tree;

public class TreeMain {

	public static void main(String[] args) {

		//Integer t[] = { 1, 6, 8, 3, 22 };
		// Integer t[] = { 6,4,8,3,5,7,9};
		//Integer t[] = { 1,2,3,4,5,6,7,8};
		Integer[] t = {1,4,6,32,2,5,7,3,6};

		BinaryTree bt = new BinaryTree();

		for (Integer idx : t) {
			bt.add(idx);
		}

		System.out.println("In-order");
		bt.traverseInOrder(bt.getRoot());
		System.out.println("\n Pre-order");
		bt.traversePreOrder(bt.getRoot());
		System.out.println("\n Post-order");
		bt.traversePostOrder(bt.getRoot());

	}

}

package javatraining.algo.tree;

public class BinaryTree {

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	Node root;

	public void add(int value) {
		root = populateTree(root,value);
	}
	
	private static Node populateTree(Node tree, Integer el) {

		if (tree == null) {
			return new Node(el);
		}

		if (el < tree.getValue()) {
			tree.setLeft(populateTree(tree.getLeft(), el));
		} else if (el > tree.getValue()) {
			tree.setRight(populateTree(tree.getRight(), el));
		} else {
			return tree;
		}

		return tree;
	}

	public void traverseInOrder(Node node) {
	    if (node != null) {
	        traverseInOrder(node.getLeft());
	        System.out.print(node.getValue() + " ");
	        traverseInOrder(node.getRight());
	    }
	}

	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(node.getValue() + " ");
			traversePreOrder(node.getLeft());
			traversePreOrder(node.getRight());
		}
	}

	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.getLeft());
			traversePostOrder(node.getRight());
			System.out.print(node.getValue() + " ");
		}
	}
	
}

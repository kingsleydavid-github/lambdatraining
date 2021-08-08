package javatraining.tree.two;

public class BinaryTree {

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	TreeNode root;

	public void addElement(Integer ele) {
		root = populate(root, ele);
	}

	private TreeNode populate(TreeNode root, Integer ele) {

		if (root == null) {
			return new TreeNode(ele);
		}

		if (ele < root.getVal()) {
			root.setLeft(populate(root.getLeft(), ele));
		} else if (ele > root.getVal()) {
			root.setRight(populate(root.getRight(), ele));
		} else {
			return root;
		}
		return root;
	}

	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.getVal() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getVal() + " ");
		}
	}

	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getVal() + " ");
			inOrder(node.getRight());
		}
	}

}

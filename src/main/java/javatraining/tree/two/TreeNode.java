package javatraining.tree.two;

public class TreeNode {

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	Integer val;
	TreeNode left;
	TreeNode right;

	public TreeNode(Integer val) {
		super();
		this.val = val;
		this.left = null;
		this.right = null;
	}

}

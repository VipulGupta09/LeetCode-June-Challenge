package com.leetcode.June;

class	TreeNode{
	 int val;
	 TreeNode left;
	 TreeNode right;
	  TreeNode(int val){
		  this.val=val;
	  }
}

public class InvertBinaryTree {
	public static TreeNode invertTree(TreeNode root) {
		if(root==null)
			return root;
		TreeNode left=invertTree(root.left);
		TreeNode right=invertTree(root.right);
		
		root.left=right;
		root.right=left;
		
		return root;
		 
	 }
	
 
 public static void main(String[] args) {
	 TreeNode root;
	InvertBinaryTree tree=new InvertBinaryTree();
	root=new TreeNode(4);
	root.left=new TreeNode(2);
	root.left.left=new TreeNode(1);
	root.left.right=new TreeNode(3);
	root.right=new TreeNode(7);
	root.right.right=new TreeNode(9);
	root.right.left=new TreeNode(6);
	
     invertTree(root);
}
 
	
}

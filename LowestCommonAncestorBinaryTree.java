/*
Given a Binary Tree and 2 nodes value n1 and n2  , your task is to find the lowest common ancestor of the two nodes . You are required to complete the function LCA . You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

Input:
The task is to complete the method LCA which takes 3 arguments, root of the Tree and two nodes value  n1 and n2 . The struct node has a data part which stores the data, pointer to left child and pointer to right child.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return the node which is the least common ancestor of the two nodes n1 and n2 .

Constraints:
1 <=T<= 30
1 <=Number of nodes<= 100
1 <=Data of a node<= 1000

Example:

Input
1
2
1 2 L 1 3 R
2 3 

Output 
1

In above example there is one  test case which represent a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 2 and right child of 1 is 3.  

*/

class GfG
{
	Node LCA(Node root, int n1,int n2)
	{
		// Your code here
		Node left = null,right = null;
		if(root.data==n1 || root.data==n2){
		    return root;
		}else{
		    if(root.left!=null){
		        left = LCA(root.left,n1,n2);
		    }
		    if(root.right!=null){
		        right = LCA(root.right,n1,n2);
		    }
		}
		if(right==null && left==null){
		    return null;
		}else if(right!=null && left!=null){
		    return root;
		}else if(right!=null){
		    return right;
		}else{
		    return left;
		}
	}
}

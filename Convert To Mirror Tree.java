/*

Mirror Tree 

Given a Binary Tree, convert it into its mirror.


Input:
The task is to complete the method that takes one argument, root of Binary Tree and modifies the tree.

Output:
The function should conert the tree to its mirror

Constraints:
1 <=T<= 75
1 <= Number of nodes<= 100
1 <= Data of a node<= 1000

Example:
Input:
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
2 1 3
30 10 60 20 40

There are two test casess.  First case represents a tree with 3 nodes, 2 edges. 
Here root is 1, left child of 1 is 3 and right child of 1 is 2.   
Second test case represents a tree with 4 edges and 5 nodes.

*/

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//function Template for Java
// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    
   {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    void mirror(Node node)
    {
	// Your code here
	    if(node.left!=null && node.right!=null){
	        mirror(node.left);
	        mirror(node.right);
	    }else if(node.left!=null){
	        mirror(node.left);
	    }else if(node.right!=null){
	        mirror(node.right);
	    }
	    Node temp = node.left;
	    node.left = node.right;
	    node.right = temp;
    }
}

/*

Question :

Given a Binary Search Tree (BST) and a node no 'x' , your task is to delete the node 'x' from the BST . You are required to complete the function deleteNode. 
You should not read any input from stdin/console. 
There are multiple test cases. 
For each test case, this method will be called individually.

*/


/* class Node
{
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
}*/
class DeleteNodeFromBST
{   
    Node deleteNode(Node root, int key) 
    {
	    // Your code here
	    if(root.key!=key){
	        Node temp = root;
	        Node prev = root;
	        while(temp.key!=key){
	            if(temp.key > key){
	                prev = temp;
	                temp = temp.left;
	            }
	            else if(temp.key < key){
	                prev = temp;
	                temp = temp.right;
	            }
	        }
	        if(temp.left==null && temp.right==null){
	            if(prev.left==temp)
	                prev.left = null;
	            else if(prev.right==temp)
	                prev.right = null;
	        }
	        else if(temp.left==null || temp.right==null){
	            if(temp.right==null){
	                if(prev.right==temp)
	                    prev.right = temp.left;
	                else if(prev.left==temp)
	                    prev.left = temp.left;
	            }
	            else if(temp.left==null){
	                if(prev.right==temp)
	                    prev.right = temp.right;
	                else if(prev.left==temp)
	                    prev.left = temp.right;
	            }
	        }
	        else{
	            Node imp = temp.right;
	            Node newPrev = temp.right;
	            if(imp.left!=null){
	                while(imp.left!=null){
	                    newPrev = imp;
	                    imp = imp.left;
	                }
	                if(prev.left==temp){
	                    prev.left = imp;
	                    imp.left = temp.left;
	                    newPrev.left = imp.right;
	                    imp.right = temp.right;
	                }
	                else if(prev.right==temp){
	                    prev.right = imp;
	                    imp.left = temp.left;
	                    newPrev.left = imp.right;
	                    imp.right = temp.right;
	                }
	            }
	            else{
	                if(prev.right==temp){
	                    imp.left = temp.left;
	                    prev.right = imp;
	                }
	                else if(prev.left==temp){
	                    imp.left = temp.left;
	                    prev.left = imp;
	                }
	            }
	        }
	    }
	    else{
	        if(root.left==null && root.right==null)
	            root = null;
	        else if(root.right==null)
	            root = root.left;
	        else if(root.left==null)
	            root = root.right;
	        else{
	            Node an = root.right;
	            Node p = root.right;
	            if(an.left!=null){
	                while(an.left!=null){
	                    p = an;
	                    an = an.left;
	                }
	                an.left = root.left;
	                p.left = an.right;
	                an.right = root.right;
	                root = an;
	            }
	            else{
	                an.left = root.left;
	                root = an;
	            }
	        }
	    }
	    return root;
    }
}

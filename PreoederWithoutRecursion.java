/*

Question :
Given a binary tree, print preorder traversal of it.

*/


/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class PreorderWithoutRecursion
{
   /* Prints preorder traversal of Binary Tree.  In output
      all keys should be separated by space. For example
      preorder traversal of below tree should be "10 20 30"
         10
       /      \ 
    20       30 */
    void preorder(Node root)
    {
       // Your code goes here
       Stack <Node> stack = new Stack<Node>();
       if(root!=null){
           Node curr = root;
           while(true){
               while(curr!=null){
                   System.out.print(curr.data);
                   System.out.print(" ");
                   stack.push(curr);
                   curr = curr.left;
               }
               if(curr==null && stack.isEmpty()!=true){
                   Node temp  = stack.pop();
                   curr = temp.right;
               }
               else{
                   break;
               }
           }
       }
    }
}

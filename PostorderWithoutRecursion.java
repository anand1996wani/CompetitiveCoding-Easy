/*

Question :

Given a binary tree, print postorder traversal of it.

*/


//User function Template for Java
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class PostorderWithoutRecursion
{
    void postOrder(Node root)
    {
       // Your code goes here
       if(root!=null){
           Stack <Node> stack = new  Stack<Node>();
           Node curr = root;
           Node temp = null;
           while(true){
               while(curr!=null){
                   stack.push(curr);
                   curr = curr.left;
               }
               if(curr==null && stack.isEmpty()!=true){
                   if(stack.peek().right==null){
                       temp = stack.pop();
                       System.out.print(temp.data);
                       System.out.print(" ");
                   }
                   else{
                       if(stack.peek().right == temp){
                           temp = stack.pop();
                           System.out.print(temp.data);
                           System.out.print(" ");
                       }
                       else{
                           curr = stack.peek().right;
                       }
                   }
               }
               else
                    break;
           }
       }
    }
}

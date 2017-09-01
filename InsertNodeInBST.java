/*

Question  :

Given a Binary Search Tree (BST) your task is to complete the function insert which inserts a node in the BST.
You should not read any input from stdin/console.
There are multiple test cases. 
For each test case, this method will be called individually.

*/

/* Structure of BST node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null; }
}*/
class InsertNodeInBST
{
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
         // Your code here
         Node node = new Node(data);
         if(root==null){
             root = node;
         }else{
             Node temp = root;
             Node prev = null;
             boolean flag = true;
             while(temp!=null){
                 if(temp.data < data){
                     prev = temp;
                     temp = temp.right;
                 }
                 else if(temp.data > data)
                 {
                     prev = temp;
                     temp = temp.left;
                 }
                 else{
                     flag = false;
                     break;
                 }
             }
             if(flag){
                 if(prev.data > data)
                    prev.left = node;
                 else
                    prev.right = node;
             }
         }
         return root;
    }
}

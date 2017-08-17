/*
Question

Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.

 Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class for LinkedList creation
class Intersect
{
    Node head;  // head of list
   
}

Answer

*/

class IntersectionOfTwoSortedLinkedList
{
    Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
    // Function  to find Intersection of two LinkedLists
    int length(Node head){
        int i = 0;
        while(head!=null){
            head = head.next;
            i = i + 1;
        }
        return i;
    }
    void getIntersection(Node head1, Node head2)
    {   
         // Your code here
         int len1 = 0,len2 = 0;
         IntersectionOfTwoSortedLinkedList g = new IntersectionOfTwoSortedLinkedList();
         len1 = g.length(head1);
         len2 = g.length(head2);
         Node small,big;
         if(len1 <= len2){
             small = head1;
             big = head2;
         }
         else{
            small = head2;
            big = head1;
         }
         Node head = new Node(-1);
         head.next = null;
         while(small!=null && big!=null){
             if(small.data == big.data){
                if(head.data!=-1){
                    Node new_node = new Node(small.data);
                    Node temp = head;
                    while(temp.next!=null)
                        temp = temp.next;
                    temp.next = new_node;
                    new_node.next = null;
                }
                else
                    head.data = small.data;
                small = small.next;
                big = big.next;
             }
             else{
                if(small.data < big.data)
                    small = small.next;
                else
                    big = big.next;
             }
         }
         if(head.data==-1)
            head = null;
         llist3.head = head;
    }
}
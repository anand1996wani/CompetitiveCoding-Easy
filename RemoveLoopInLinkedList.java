/*

Question :

Given a linked list, remove the loop in it if present. 
The task is to complete the function remove TheLoop which takes only one argument the head of the linked list .
The function removes the loop in the linked list if present.

*/


/*Complete The function
Node is as follows:
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class RemoveLoopInLinkedList {
	  int removeTheLoop(Node node) {
        //add code here.
        Node slow,fast;
        slow = node;
        fast = node;
        while(slow!=fast && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==slow){
            fast.next = null;//Loop removed
            return 1;
        }
        else{
            return 0;//no loop present
        }
        }
}
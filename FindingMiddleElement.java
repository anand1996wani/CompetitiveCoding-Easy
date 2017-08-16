/*

Question

Given a singly linked list, find the middle element of the linked list.

Answer

*/

int findingMiddleElement(Node* head){
	int getMiddle(Node head)
   {
         // Your code here.
        if(head!=null && head.next!=null){
		    Node slow,fast;
		    slow = head;
		    fast = head;
		    while(fast!=null && fast.next!=null){
			    slow = slow.next;
			    fast = fast.next;
			    fast = fast.next;
		    }
		    return slow.data;
	    }
	    else if(head==null)
		    return -1;
	    else
		    return head.data;
   }
}
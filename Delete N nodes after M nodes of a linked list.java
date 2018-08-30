/*
Given a linked list, delete N nodes after skipping M nodes of a linked list until the last of the linked list.

Input:

Complete the method which takes three argument: the head of the linked list,M an N. 
Function should not read any input from stdin/console.
The struct Node has a data part which stores the data and a next pointer which points to the next element of the linked list. 
There are multiple test cases. For each test case, this method will be called individually.
 

Output:

Function should not print any output to stdin/console
 

Example:

M = 2, N = 2
Linked List: 1->2->3->4->5->6->7->8
After 2 nodes 2 nodes will be deleted.Deleted Nodes 3->4 and 7->8
Output: Linked List: 1->2->5->6

For Testing use this format:
1 (Test case)
8 (Number of elements in linked list)
2 1(M and N)
9 1 3 5 9 4 10 1 (8 Number)
output : 9 1 5 9 10 1
*/

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
delete n nodes after m nodes
  The input list will have at least one element  
  Node is defined as 
  struct node
  {
     int data;
     struct node *next;
  }
*/
void linkdelete(struct node  *head, int m, int n)
{
//Add code here
        int count = 0;
        int count1 = 0;
        node *temp = head;
        node *prev = NULL;
        while(temp!=NULL){
            if(count!=m && count1==0){
                prev = temp;
                temp = temp->next;
                count++;
            }else{
                count = 0;
            }
            if(count1!=n && count==0){
                temp = temp->next;
                count1++;
            }else{
                prev->next = temp;
                count1=0;
            }
        }
        prev->next = temp;
}

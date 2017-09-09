/*
Implement a Queue using Array.

Input (To be used for Expected Output):

The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)

The second line of each test case contains Q queries seperated by space.

*/


/*
The structure of the class is
class Queue_using_array {
     int front;
     int rear;
	 int arr[]=new int[1000];
    Queue_using_array()
	{
		front=0;
		rear=0;
	}
*/
//This is method only submission
class ImplementQueueUsingArray
{
	/* The method push to push element into the queue */
	void push(int a, Queue_using_array ob)
	{
				// Your code
				ob.arr[ob.rear++] = a;
	} 
      /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_array ob)
	{
			// Your code
			if(ob.front < ob.rear){
			    return ob.arr[ob.front++];
			}
			else{
			    ob.front = 0;
			    ob.rear = 0;
			    return -1;
			}
	} 
}

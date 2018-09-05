/*

Your task is to implement  2 stacks in  one array efficiently .

Input (To be used for Expected Output):

The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
First line of each test case contains an integer Q denoting the number of queries . 
 A Query Q is of 4 Types
(i)    1 1 x    (a query of this type means  pushing 'x' into the stack 1)
(ii)   1 2      (a query of this type means to pop element from stack1  and print the poped element)
(iii)  2 1 x  (a query of this type means pushing 'x' into the stack 2)
(iv)  2 2     (a query of this type means to pop element from stack2 and print the poped element)

The second line of each test case contains Q queries seperated by space.

Output:
The output for each test case will  be space separated integers having -1 if the stack is empty else the element poped out from the stack. 
You are required to complete the 4  methods push1, push2 which takes one argument an integer 'x' to be pushed into the stack one and two  and pop1, pop2 which returns a integer poped out from stack one and two .

Constraints:
1<=T<=100
1<=Q<=100
1<=x<=100

Example:
Input
1
6
1 1 2 1 1 3 2 1 4 1 2 2 2 2 2

Output
3 4 -1

Explanation:

In the first test case for query 
1 1 2    the stack1 will be {2}
1 1 3    the stack1 will be {2,3}
2 1 4   the stack2 will be {4}
1 2      the poped element will be 3 from stack1 and stack1 will be {2}
2 2      the poped element will be 4 from stack2 and now stack2 is empty
2 2      the stack2 is now empty hence -1 .  


Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.

*/

/*The structure of the class is
class twoStacks
{
    int *arr;
    int size;
    int top1, top2;
public:
   twoStacks(int n=100){size = n; arr = new int[n]; top1 = -1; top2 = size;}
 
   void push1(int x);
   void push2(int x);
   int pop1();
   int pop2();
};
*/
/* The method push to push element into the stack 2 */
void twoStacks :: push1(int x)
   {
       if(this->top1 < this->top2){
           this->top1 = this->top1 + 1;
           this->arr[this->top1] = x;
       }
   }
   
/* The method push to push element into the stack 2*/
void twoStacks ::push2(int x)
   {
        if(this->top2 > this->top1){
            this->top2 = this->top2 - 1;
            this->arr[this->top2] = x;
        }
   }
   
/* The method pop to pop element from the stack 1 */
int twoStacks ::pop1()
   {
       if(this->top1==-1){
           return -1;
       }else{
           return this->arr[this->top1--];
       }
   }
/* The method pop to pop element from the stack 2 */
int twoStacks :: pop2()
   {
       if(this->top2==this->size){
           return -1;
       }else{
           return this->arr[this->top2++];
       }
   }

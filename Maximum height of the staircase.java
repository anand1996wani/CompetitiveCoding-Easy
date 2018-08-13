/*
Maximum height of the staircase

Given N number of square blocks. The height of each square block is 1. 
The task is to create a  staircase of max height using these blocks.

Note: The first stair would require only one block, the second stair would require two blocks and so on.

Input:

The first line of the input contains T i.e number of test cases. Each line of the test case contains a number  N 
i.e number of blocks. 

Output:

Each new line of the output contains only one single integer i.e Maximum height of staircase.

Constraints:

1<=T<=100

1<=N<=10^8

Example:

Input:

3
10
12
16

Output:

4
4
5

Explanation:

Test Case 1: the max height of the staircase that can be made from  12  blocks is 4. 
(A staircase of height 4 means sequence of 1,2,3,4 blocks to create a valid staircase.)
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int a = 0;a < test;a++){
		    int n = scanner.nextInt();
		    int count = 0;
		    int sum = 1;
		    int i = 2;
		    while(sum <= n){
		        sum = sum + i++;
		        count++;
		    }
		    System.out.println(count);
		}
	}
}

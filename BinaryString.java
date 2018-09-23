/*package whatever //do not write package name here */

/*

Binary String 

Given a binary string, count number of substrings that start and end with 1. 
For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

Input:

The first line of input contains an integer T denoting the number of test cases.
Each test case consist of an integer 'n' denoting the string length and next line is followed by a binary string .


Output:

Print the number of substring starting and ending with 1 in a separate line.

Constraints:

1 ≤ T ≤ 40
1 ≤ |s| ≤ 1000


Example:

Input:
1
4
1111

Output:
6

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int j = 0;j < test;j++){
		    int n = scanner.nextInt();
		    String st = scanner.next();
		    int c = 0;
		    for(int i = 0;i < st.length();i++){
		        if(st.charAt(i)=='1'){
		            c++;
		        }
		    }
		    System.out.println((int)((c*(c-1))/2));
		}
	}
}

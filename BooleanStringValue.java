/*

Question : 

Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class BooleanStringValue{
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand < test;anand++){
		    String string = s.next();
		    char[] new_string = string.toCharArray();
		    int length = new_string.length;
		    int i = 1;
		    char ans = new_string[0];
		    char op;
		    while(i < length){
		        op = new_string[i++];
		        if(op=='A'){
		            if(ans=='1' && new_string[i++]=='1')
		                ans = '1';
		            else
		                ans = '0';
		        }
		        else if(op == 'B'){
		            if(ans == '0' && new_string[i++]=='0')
		                ans = '0';
		            else
		                ans = '1';
		        }
		        else if(op == 'C'){
		            if(ans!=new_string[i++])
		                ans = '1';
		            else
		                ans = '0';
		        }
		    }
		    System.out.println(ans);
		}
	}
}
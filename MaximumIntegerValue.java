/*

Question : 
Given a string of numbers, the task is to find the maximum value from the string, you can add a ‘+’ or ‘*’ sign between any two numbers.

Note: Add sign between two numbers on the basis of numbers not on the value calculated till that number.

For eg: n = 5120 
(((5 + 1 ) + 2 ) + 0 ) = 8 is right.
5120 
(((5 + 1 ) * 2 ) + 0 ) = 12 is wrong.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumIntegerValue {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int next = s.nextInt();
		for(int anand = 0;anand < next;anand++){
		    String st = s.next();
		    char[] ch = st.toCharArray();
		    int[] imp = new int[ch.length];
		    for(int i = 0;i < ch.length;i++){
		        switch(ch[i]){
		            case '0':
		                imp[i] = 0;
		                break;
		            case '1':
		                imp[i] = 1;
		                break;
		            case '2':
		                imp[i] = 2;
		                break;
		            case '3':
		                imp[i] = 3;
		                break;
		            case '4':
		                imp[i] = 4;
		                break;
		            case '5':
		                imp[i] = 5;
		                break;
		            case '6':
		                imp[i] = 6;
		                break;
		            case '7':
		                imp[i] = 7;
		                break;
		            case '8':
		                imp[i] = 8;
		                break;
		            case '9':
		                imp[i] = 9;
		                break;
		        }
		    }
		    int value = imp[0];
		    for(int i = 1;i < imp.length;i++){
		        if(imp[i]==0 || imp[i]==1 || imp[i-1]==1 || imp[i-1]==0){
		            value = value + imp[i];
		        }
		        else{
		            value = value * imp[i];
		        }
		    }
		    System.out.println(value);
		}
	}
}
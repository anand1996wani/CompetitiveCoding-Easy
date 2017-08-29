/*

Question :

Rearrange a string
Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.


*/


import java.util.*;
import java.lang.*;
import java.io.*;
class RearrangeAString
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        String st = s.next();
	        char[] c = st.toCharArray();
	        int a = 0;
	        int val = 0;
	        char[] new_c = new char[c.length];
	        for(int i = 0;i < c.length;i++){
	            switch(c[i]){
	                case '0':
	                    val += 0;
	                    break;
	                case '1':
	                    val += 1;
	                    break;
	                case '2':
	                    val += 2;
	                    break;
	                case '3':
	                    val += 3;
	                    break;
	                case '4':
	                    val += 4;
	                    break;
	                case '5':
	                    val += 5;
	                    break;
	                case '6':
	                    val += 6;
	                    break;
	                case '7':
	                    val += 7;
	                    break;
	                case '8':
	                    val += 8;
	                    break;
	                case '9':
	                    val += 9;
	                    break;
	                default:
	                    new_c[a++] = c[i];
	                    break;
	            }
	        }
	        Arrays.sort(new_c);
	        for(int i = 0;i < new_c.length;i++){
	            System.out.print(new_c[i]);
	        }
	        System.out.print(val);
	        System.out.println();
	    }
	 }
}
/*

Question :

Given a string S as input. You have to reverse the given string.

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class ReverseAString
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        String string = s.next();
	        String result = "";
	        for(int i = string.length()-1; i>=0;i--){
	            result = result + string.charAt(i);
	        }
	        System.out.println(result);
	    }
	 }
}

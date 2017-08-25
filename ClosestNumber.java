/*

Question : 

Given two integers n and m. The problem is to find the number closest to n and divisible by m. If there are more than one such number, then output the one having maximum absolute value. If n is completely divisible by m(not equal to 0), then output n only. Time complexity of O(1) is required.

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class ClosestNumber{
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test;
		test = s.nextInt();
		for(int anand = 0;anand < test;anand++){
		    int n,m;
		    n = s.nextInt();
		    m = s.nextInt();
		    if(n%m==0)
		        System.out.println(n);
		    else{
		        int temp = n/m;
		        if(temp > 0){
    		        if(Math.abs((m*temp)-n) > Math.abs((m*(temp+1)-n))){
    		            System.out.println(m*(temp+1));
    		        }
    		        else if(Math.abs((m*temp)-n) < Math.abs((m*(temp+1)-n))){
    		            System.out.println(m*temp);
    		        }
    		        else{
    		            if(Math.abs(m*temp) > Math.abs(m*(temp + 1)))
    		                System.out.println(m*temp);
    		            else
    		                System.out.println(m*(temp + 1));
    		        }
		        }
		        else{
		            if(Math.abs((m*temp)-n) > Math.abs((m*(temp-1)-n))){
    		            System.out.println(m*(temp-1));
    		        }
    		        else if(Math.abs((m*temp)-n) < Math.abs((m*(temp-1)-n))){
    		            System.out.println(m*temp);
    		        }
    		        else{
    		            if(Math.abs(m*temp) > Math.abs(m*(temp - 1)))
    		                System.out.println(m*temp);
    		            else
    		                System.out.println(m*(temp - 1));
    		        }
		        }
		    }
		}
	}
}
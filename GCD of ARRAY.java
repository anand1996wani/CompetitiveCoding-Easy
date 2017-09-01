/*

Question :

For a given array find out the GCD of the array.

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GCD of ARRAY.java{
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand<test;anand++){
		    int n = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i<n;i++){
		        array[i] = s.nextInt();
		    }
		    GFG g = new GFG();
		    Arrays.sort(array);
		    int z = array[0];
		    if (n > 1){
		        z = g.gcd(array[0],array[1]);
		        for(int i = 2;i<n;i++){
		            z = g.gcd(z,array[i]);
		        }
		    }
		    System.out.println(z);
		}
	}
	public int gcd(int a,int b){
	    int temp;
	    while(a%b!=0){
	        temp = a%b;
	        a = b;
	        b = temp;
	    }
	    return b;
	}
}
/*

Question :

Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side. 
The rightmost element is always a leader. 

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class LeadersInArray {
	public static void main (String[] args) {
		//code
		Scanner s  = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand < test;anand++){
		    int n = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i<n;i++){
		        array[i] = s.nextInt();
		    }
		    int[] new_array = new int[n];
		    int max = array[n-1];
		    int count = 0;
		    new_array[count++] = array[n-1];
		    for(int i = n-2;i>=0;i--){
		        if(array[i] > max){
		            new_array[count++] = array[i];
		            max = array[i];
		        }
		    }
		    count--;
		    while(count>=0){
		        System.out.print(new_array[count--]);
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
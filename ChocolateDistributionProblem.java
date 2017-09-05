/*

Question :
Given an array A[] of N integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students in packet with maximum chocolates and packet with minimum chocolates is minimum.


*/



import java.util.*;
import java.lang.*;
import java.io.*;

class ChocolateDistributionProblem {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand < test;anand++){
		    int n = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i < n;i++){
		        array[i] = s.nextInt();
		    }
		    int m = s.nextInt();
		    Arrays.sort(array);
		    int min = 101;
		    for(int i = 0;i < array.length - m + 1;i++){
		        if(min > array[i + m - 1] - array[i]){
		            min = array[i + m - 1] - array[i];
		        }
		    }
		    System.out.println(min);
		}
	}
}
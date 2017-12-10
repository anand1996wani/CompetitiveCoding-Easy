/*
Question : 

The positive odd numbers are sorted in ascending order as1,3,5,7,9,11...  and grouped as (1), (3,5), (7,9,11), (13,15,17,19) and so on.

Thus, the first group is (1) , the second group is (3,5), the third group is (7,9,11), etc. In general, the Kth group contains the next K elements of the sequence.

Given K, find the sum of the elements of the kth group. For example, for K = 3 , the answer is 27 :

 k = 3
	7 + 9 + 11 = 27

Complete the function sumOfGroup with input integer K. Return the sum of the elements of the th group.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumberGroups {

    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        long t = (long)k*(k-1)/2;
        long firstNo = t*2 + 1;
        long sum = 0;
        while(k!=0){
            sum = sum + firstNo;
            firstNo = firstNo + 2;
            k = k-1; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}

/*

The Love-Letter Mystery

James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
The letter a may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

For example, given the string , the following two operations are performed: cde → cdd → cdc.

Function Description

Complete the theLoveLetterMystery function in the editor below. It should return the integer representing the minimum number of operations needed to make the string a palindrome.

theLoveLetterMystery has the following parameter(s):

s: a string
Input Format

The first line contains an integer , the number of queries. 
The next  lines will each contain a string .

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int  j = s.length() - 1;
        for(int i = 0; i < s.length()/2;i++){
            if(s.charAt(i) != s.charAt(j)){
                count = count + Math.abs(s.charAt(i) - s.charAt(j));
            }
            j = j - 1;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

/*

Complete the gameOfThrones function below to determine whether a given string can be rearranged into a palindrome. 
If it is possible, return YES, otherwise return NO.


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length();i++){
            if(hashMap.get(s.charAt(i))!=null){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i)) + 1);
            }else{
                hashMap.put(s.charAt(i),1);
            }
        }
        int c = 0;
        for(Map.Entry entry : hashMap.entrySet()){
            if((int)entry.getValue() % 2 != 0)
                c++;
        }
        if(c == 0 || c == 1)
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

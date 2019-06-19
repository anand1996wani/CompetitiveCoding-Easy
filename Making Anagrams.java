/*

Making Anagrams

We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. 
In other words, both strings must contain the same exact letters in the same exact frequency. 
For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice is taking a cryptography class and finding anagrams to be very useful. 
She decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for(int i = 0; i < s1.length();i++){
            if(hashMap1.get(s1.charAt(i))!=null){
                hashMap1.put(s1.charAt(i),hashMap1.get(s1.charAt(i)) + 1);
            }else{
                hashMap1.put(s1.charAt(i),1);
            }
        }

        for(int i = 0; i < s2.length();i++){
            if(hashMap2.get(s2.charAt(i))!=null){
                hashMap2.put(s2.charAt(i),hashMap2.get(s2.charAt(i)) + 1);
            }else{
                hashMap2.put(s2.charAt(i),1);
            }
        }
        int total_cost = 0;
        for(Map.Entry mapElement : hashMap1.entrySet()){
            if(hashMap2.get((char)mapElement.getKey()) == null){
                total_cost = total_cost + (int)mapElement.getValue(); 
            }else{
                total_cost = total_cost + Math.abs((int)hashMap2.get((char)mapElement.getKey()) - (int)mapElement.getValue());
            }
        }

        for(Map.Entry mapElement : hashMap2.entrySet()){
            if(hashMap1.get((char)mapElement.getKey()) == null){
                total_cost = total_cost + (int)mapElement.getValue(); 
            }
        }

        return total_cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

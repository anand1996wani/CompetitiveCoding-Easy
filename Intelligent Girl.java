/*

Intelligent Girl

Soumika has a string S and its starting index is 1. The string S consists of characters from . As she is very intelligent, she wants to test his brother Vinay Tendulkar. She asked her brother Vinay Tendulkar to count the number of even numbered characters ( i.e  ) for every index i . For an index i, the result should be calculated from i to the end of the string. As Vinay doesn't know about programming, he wants you to help him find the solution.

Input:
First line contains a string S.

Output:
Print |S| space-separated integers,the result of every index.

Constraints:
1 ≤ |S| ≤ 4

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        String string = scanner.next();
        int count = 0;
        int array[] = new int[string.length()];
        for(int i = string.length() - 1;i >= 0;i--){
            char a = string.charAt(i);
            int b = a - '0';
            if(b % 2 == 0){
                count++;
            }
            array[i] = count;
        }
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}

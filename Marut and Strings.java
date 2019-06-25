/*
Marut and Strings

Marut loves good strings. According to him, good strings are those which contain either all alphabets of uppercase or lowercase. While he is preparing for his exams, he finds many bad strings in his book and wants to convert them to good strings. But he wants to do this in minimum number of operations.
In one operation, he can pick only one character of any case and convert it to any other case.

As his exams are going on, he wants your help.

Input:
The first line contains an integer T, denoting the number of test cases.
Each test case consists of only one line with a string S which contains uppercase and lowercase alphabets..

Output:
Print the minimum number of operations, in which Marut can obtain a good string.
Print the answer for each test case in new line.

Constraints:
1 ≤ T ≤ 10
If T is not in this range, print "Invalid Test" (without the quotes)
1 ≤ Length of S ≤ 100
S can contain numbers, special characters but no spaces.
If the length of string is not in the above range or it does not contain any alphabets, print "Invalid Input" (without the quotes)

For Example, if the input is:
0
TestString

Print "Invalid Test" (without the quotes)


*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test = 0;
        try{
            test = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Invalid Test");
            return;
        }
        if(test != 0){
            for(int t = 0; t < test;t++){
                int small = 0;
                int capital = 0;
                try{
                    String string = scanner.next();
                    boolean flag = false,g = false;
                    if(string.length() > 0 && string.length() <= 100){
                        for(int i = 0; i < string.length();i++){
                            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                                flag = true;
                                small++;
                            }else if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                                flag = true;
                                capital++;
                            }
                        }
                        if(flag){
                            if(small < capital){
                                System.out.println(small);
                            }else{
                                System.out.println(capital);
                            }
                        }else{
                            System.out.println("Invalid Input");
                        }
                    }else{
                        System.out.println("Invalid Input");
                    }
                }catch(Exception e){
                    System.out.println("Invalid Test");
                    break;
                }
            }
        }else{
            System.out.println("Invalid Test");
        }
    }
}

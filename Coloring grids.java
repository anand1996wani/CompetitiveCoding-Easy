/*

You are given a  grid and  colors. Your task is to determine the number of ways to color each cell by adhering to the following condition:

For any vertical line that divides the grid into two non-empty parts, the number of distinct colors on the right side must be equal to the number of distinct colors on the left side. Note that you can only divide the grid so that every cell either completely belongs to the left or right.

Input format

The first line of the input contains two integers  and  .

Output format

Print the number of ways to color each cell by following the mentioned condition.

Constraints


Sample input #2

189232688 48695377
Sample output #2

48695377

*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        if(n==2)
            System.out.println(k*k);
        else
            System.out.println(k);
    }
}

/*

Trick with the cards

Mr. X is performing a trick with the cards. He has N cards, lets name them 1.....N, on a round table. So card 1 is in between 2nd card and Nth card. Initially all cards are upside down. His trick involves making all cards face up.

His trick is whenever he taps on a card, it flips (if card was originally upside down, after flipping its faces up, and vice-versa), but he is no ordinary magician, he makes the two adjacent cards (if any) also to flip with the single tap. Formally, if he taps ith card, then i-1, i, i+1 cards are flipped. (Note that if he taps Nth card, then he flips (N-1)th, Nth and 1st card.)

Our magician needs a helper, to assist him in his magic tricks. He is looking for someone who can predict minimum number of taps needed to turn all the cards facing up.

Input : 
First line of input contains T, the number of test cases. Then T lines follows, each line contains N, the number of cards for that particular case.

Output : 
Print the output for each case in a single line.

Constraints : 
1 <= T <= 10^5 
0 <= N <= 10^15


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
        Scanner scanner = new Scanner(System.in);
        // Write your code here
        int test = scanner.nextInt();
        for(int t = 0;t < test;t++){
            long n = scanner.nextLong();
            if(n == 0){
                System.out.println(0);
            }else if(n <= 3){
                System.out.println(1);
            }else if( n%3 == 0 ){
                n = (long)(n / 3);
                System.out.println(n);
            }else if( n%3 == 1 ){
                System.out.println(n);
            }else if( n%3 == 2 ){
                System.out.println(n);
            }
        }
    }
}

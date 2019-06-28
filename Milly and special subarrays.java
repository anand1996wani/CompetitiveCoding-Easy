/*

Milly and special subarrays

Milly is playing with an array A of size N. She is trying to find those non-empty subarrays (sequence of consecutive elements) whose maximum and minimum values are identical. Milly got confused while counting. Your task is to help her in this problem.

Input
First line of the input will contain T denoting the number of test-cases.
For every test case, first line will contain N. Next line will contain N space separated integers denoting Ai.
Output
For every test case, print the required answer in a separate line.
Constraints
1 ≤ T ≤ 10
1 ≤ N ≤ 105
1 ≤ |Ai| ≤ 109
Here, || denotes the absolute value.
SAMPLE INPUT 
1
3
1 1 3
SAMPLE OUTPUT 
4
Explanation
Test case 1:
Special subarrays for the given sample case include :- [1], [1], [3], [1, 1].

Time Limit:	1.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int t = 0;t < test;t++){
            int n = scanner.nextInt();
            int array[] = new int[n];
            for(int i = 0; i < n;i++){
                array[i] = scanner.nextInt();
            }
            int count = 1;
            int total = 0;
            int prev = array[0];
            for(int i = 1; i < array.length;i++){
                if(prev == array[i]){
                    count++;
                }else{
                    total = total + (int)(count*(count + 1)/2);
                    count = 1;
                    prev = array[i];
                }
            }
            total = total + (int)(count*(count + 1)/2);
            System.out.println(total);
        }
    }
}

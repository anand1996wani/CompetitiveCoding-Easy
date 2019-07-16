/*

Gas Stations

Xenny's is competing in a race and his car has X litres of fuel. There are N milestones in the competition. It takes no fuel at all to travel between gas stations, but at the  gas station,  amount of petrol is drained.

Find the number milestones Xenny crosses before his car gets out of fuel.

Input
The first line of input consists of 2 space-separated integers - N and X.

The second line contains N space-separated integers - 

Output
Print a single integer - the number of milestones Xenny crosses.

Constraints



SAMPLE INPUT 
60 7
1 13 5 6 3 5 10 7 1 8 9 3 1 4 11 9 7 9 1 11 13 11 8 4 11 11 10 2 10 13 12 8 11 1 9 4 10 8 7 1 3 2 10 12 5 5 10 10 7 7 7 12 4 2 1 7 12 9 5 5
SAMPLE OUTPUT 
2

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        // Write your code here
        int array[] = new int[n];
        for(int i = 0;i < n;i++){
            array[i] = scanner.nextInt();
        }
        int c = 0;
        int j = 0;
        while(k >= 0){
            k = k - array[j++];
            c = c + 1;
        }
        System.out.println(c);
    }
}

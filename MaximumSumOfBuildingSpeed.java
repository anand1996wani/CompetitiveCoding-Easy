/*

Maximum Sum of Building Speed

You are the king of Pensville where you have 2N workers.
All workers will be grouped in association of size 2,so a total of N associations have to be formed.
The building speed of the ith worker is Ai.
To make an association, you pick up 2 workers. Let the minimum building speed between both workers be x, then the association has the resultant building speed x.
You have to print the maximum value possible of the sum of building speeds of N associations if you make the associations optimally.

Constraints
1≤N≤5∗104
1≤Ai≤104

Input
First line contains an integer N, representing the number of associations to be made.
Next line contains 2N space separated integers, denoting the building speeds of 2N workers.

Output
Print the maximum value possible of the sum of building speeds of all the associations.


*/

import java.util.*;
class MaximumSumOfBuildingSpeed {
    public static void main(String args[] ) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[2*n];
        for(int i = 0;i < 2*n;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        int sum = 0;
        for(int i = 2*n-2;i>=0;i = i - 2){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

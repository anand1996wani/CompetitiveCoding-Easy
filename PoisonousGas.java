/*
You are in a battle field and your enemy has an army of N soldiers. 
Each soldier has a strength denoted by an array A. 
Your enemy will select some soldiers such that total strength of selected soldiers is maximum. 
You have a poisonous gas and you can use it on the selected soldiers as many times as you want. 
If the total strength is even, the poisonous gas will decrease the total strength of the selected soldiers to half of the total strength, otherwise it will not affect them. 
Your task is to tell if its possible to reduce the total strength to 1 or not.

 

Input Format:

First line contains an integer T, denoting the number of test cases.
First line of each test case contains an integer N, denoting the number of soldiers.
Second line of each test case contains N space-separated integers, denoting the strength of the soldiers.
 

Output Format:

For each test case, print Yes if its possible to reduce the total strength to 1, otherwise print No.
*/

import java.util.Scanner;
class PoisonousGas{
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i = 0;i < test;i++){
            int n = scanner.nextInt();
            long array[] = new long[n];
            for(int j = 0;j<n;j++){
                array[j] = scanner.nextLong();
            }
            long max = 0;
            for(int j = 0;j < n;j++){
                if(array[j] > 0)
                    max = max + array[j];
            }
            if(max%2 == 0 && max > 0){
                while(max%2 == 0 && max > 1){
                    max = max/2;
                }
                if(max==1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }
    }
}

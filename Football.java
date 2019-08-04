/*
Football 

A football competition has just finished. The players have been given points for scoring goals and points for committing fouls. Now, it is up to Alex to find the best player in the tournament. As a programmer, your job is to help Alex by telling him the highest number of points achieved by some player.

You are given two sequences A1,A2,…,AN and B1,B2,…,BN. For each valid i, player i scored Ai goals and committed Bi fouls. For each goal, the player that scored it gets 20 points, and for each foul, 10 points are deducted from the player that committed it. However, if the resulting number of points of some player is negative, this player will be considered to have 0 points instead.

You need to calculate the total number of points gained by each player and tell Alex the maximum of these values.


*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int t = 0;t < test;t++){
		    int n = scanner.nextInt();
		    int array[] = new int[n];
		    int pel[] = new int[n];
		    for(int i = 0; i < n;i++){
		        array[i] = scanner.nextInt();
		    }
		    for(int i = 0; i < n;i++){
		        pel[i] = scanner.nextInt();
		    }
		    int max = 0;
		    for(int i = 0;i < n;i++){
		        int temp = (20*array[i]) - (10*pel[i]);
		        max = Math.max(temp,max);
		    }
		    System.out.println(max);
		}
	}
}

/*

Question :

Given three arrays sorted in non-decreasing order, print all common elements in these arrays.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class CommonElements {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for(int anand = 0;anand < test;anand++){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int n3 = s.nextInt();
            int[] array1 = new int[n1];
            int[] array2 = new int[n2];
            int[] array3 = new int[n3];
            for(int i = 0;i < n1;i++){
                array1[i] = s.nextInt();
            }
            for(int i = 0;i < n2;i++){
                array2[i] = s.nextInt();
            }
            for(int i = 0;i < n3;i++){
                array3[i] = s.nextInt();
            }
            int[] array4 = new int[Math.min(n1,n2)];
            int c4 = 0,c1 = 0,c2 = 0;
            while(c1 < array1.length && c2 < array2.length){
                if(array1[c1] < array2[c2]){
                    c1++;
                }
                else if(array1[c1] > array2[c2]){
                    c2++;
                }
                else{
                    array4[c4++] = array1[c1++];
                    c2++;
                }
            }
            int i = 0;
            int c3 = 0;
            int c5 = 0;
            int[] array5 = new int[Math.min(c4,n3)];
            while(i < c4 && c3 < array3.length){
                if(array4[i] < array3[c3]){
                    i++;
                }
                else if(array4[i] > array3[c3]){
                    c3++;
                }
                else{
                    array5[c5++] = array4[i];
                    i++;
                    c3++;
                }
            }
            if(c5!=0){
                for(int k = 0;k < c5;k++){
                    System.out.print(array5[k]);
                    System.out.print(" ");
                }
            }
            else{
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}

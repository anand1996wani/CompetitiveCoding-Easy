/*

Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.


*/

class Solution {
    static long nthFibonacci(long n){
        // code here
        long f0 = 0, f1 = 1;
        for(int i = 2;i <=n;i++){
            long fi = (f0 + f1)%(1000000007);
            f0 = f1;
            f1 = fi;
        }
        //System.out.println(f1)
        return f1;
    }
}

'''

Question :

You are given an array, a of n non-zero positive integers. The array is said to be beautiful if all the following constraints are satisfied:

1: The array consists of unique elements.

2: The array elements are not sorted in ascending order.

3: All the array elements should have a value between 1 to n inclusive, i.e., 1 <= a[i] <= n, where 0 < i < n.

If the array is beautiful, print Beautiful; otherwise print Ugly. 
For example, array A = [1, 2, 3, 4] is considered Ugly because all elements are sorted in ascending order hence violating the second constraint.

'''



#!/bin/python3

import sys

def uglyOrBeautiful(a):
    # Complete this function
    flag = True
    for i in range(len(a)-1):
        if a[i] > a[i+1]:
            break
    else:
        flag = False
    if flag:
        for i in a:
            if i < 1 or i > len(a):
                flag = False
                break
    if flag:
        c = list(set(a))
        if len(c)!=len(a):
            flag = False
    if flag:
        return "Beautiful"
    else:
        return "Ugly"
    

if __name__ == "__main__":
    q = int(input().strip())
    for a0 in range(q):
        n = int(input().strip())
        a = list(map(int, input().strip().split(' ')))
        result = uglyOrBeautiful(a)
        print(result)

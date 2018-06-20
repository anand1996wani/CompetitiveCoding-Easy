'''
Given two numbers represented by two arrays, write a function that returns sum array. 
The sum array is an array representation of addition of two input arrays. It is not allowed to modify the arrays.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains two integers M and N separated by a space. 
M is the size of arr1 and N is the size of arr2.
The second line of each test case contains M integers which is the input for arr1.
The third line of each test case contains N integers which is the input for arr2.

Output:

Print the sum list.


'''

#code

test = int(input())
for case in range(test):
    array = list(map(int,input().strip().split()))
    m = array[0]
    n = array[1]
    arrayM = list(map(int,input().strip().split()))
    arrayN = list(map(int,input().strip().split()))
    result = []
    #print(arrayN)
    #print(arrayM)
    if m < n:
        s = 0
        j = n - 1
        for i in range(m-1,-1,-1):
            s = s + arrayM[i] + arrayN[j]
            j = j - 1
            if(s < 10):
                result.append(s)
                s = 0
            else:
                result.append(s%10)
                s = 1
        while j>=0:
            s = s + arrayN[j]
            j = j - 1
            if(s < 10):
                result.append(s)
                s = 0
            else:
                result.append(s%10)
                s = 1
            #print(result)
        if s!=0:
            result.append(1)
        #print(result[::-1])
    elif n < m:
        s = 0
        j = m - 1
        for i in range(n-1,-1,-1):
            s = s + arrayN[i] + arrayM[j]
            j = j - 1
            if(s < 10):
                result.append(s)
                s = 0
            else:
                result.append(s%10)
                s = 1
        while j>=0:
            s = s + arrayM[j]
            j = j - 1
            if(s < 10):
                result.append(s)
                s = 0
            else:
                result.append(s%10)
                s = 1
            #print(result)
        if s!=0:
            result.append(1)
        #print(result[::-1])
    else:
        s = 0
        for i in range(n-1,-1,-1):
            s = s + arrayN[i] + arrayM[i]
            if(s < 10):
                result.append(s)
                s = 0
            else:
                result.append(s%10)
                s = 1
        if s!=0:
            result.append(1)
        #print(result[::-1])
    for i in range(len(result)-1,-1,-1):
        print(result[i],end = " ")
    print()

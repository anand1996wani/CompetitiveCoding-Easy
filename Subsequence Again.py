'''

Question :

You are provided with a string s and an integer k. You have to find another string t which satisfies the following conditions:

1: t must be a subsequence of s.

2: Every character in t must occur at least k times. 

3: The length of t must be as large as possible.

4: If there are multiple strings for t with largest possible length, pick the lexicographically smallest one.

For example, let's say the string is s = hackerrank and k = 2. 
The solution for this is akrrak. Here t is a subsequence of s, it contains the characters a,k and r repeated at least k times. 
And, it is the only longest possible subsequence that satisfies the conditions. 

'''


#!/bin/python3

import sys
import collections

def subsequenceAgain(s, k):
    # Complete this function
    d = collections.OrderedDict()
    for i in s:
        if i not in d:
            d.update({i:1})
        else:
            d[i] = d[i] + 1
    st = ""
    for i in s:
        if(d[i]>=k):
            st = st + i
    return st

if __name__ == "__main__":
    s = input().strip()
    k = int(input().strip())
    result = subsequenceAgain(s, k)
    print(result)

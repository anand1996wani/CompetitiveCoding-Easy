'''
Mathison and pangrams  :

Mathison recently inherited an ancient papyrus that contained some text. Unfortunately, the text was not a pangram. Now, Mathison has a particular liking for holoalphabetic strings and the text bothers him. The good news is that Mathison can buy letters from the local store in order to turn his text into a pangram. 
However, each letter has a price and Mathison is not very rich. Can you help Mathison find the cheapest way to obtain a pangram? 


'''


# cook your dish here
t = int(input())
for anand in range(t):
    price = list(map(int,input().strip().split()))
    s = str(input().strip())
    s = list(s)
    s = list(set(s))
    s.sort()
    for i in range(len(s)):
        s[i] = ord(s[i]) - ord('a')
    value = 0
    j = 0
    for i in range(len(price)):
        if(j < len(s)):
            if s[j]!=i:
                value = value + price[i]
            else:
                j = j + 1
        else:
            value = value + price[i]
    print(value)
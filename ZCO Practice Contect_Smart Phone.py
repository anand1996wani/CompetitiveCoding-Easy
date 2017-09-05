'''

You are developing a smartphone app. You have a list of potential customers for your app. Each customer has a budget and will buy the app at your declared price if and only if the price is less than or equal to the customer's budget.
You want to fix a price so that the revenue you earn from the app is maximized. Find this maximum possible revenue.
For instance, suppose you have 4 potential customers and their budgets are 30, 20, 53 and 14. In this case, the maximum revenue you can get is 60.


'''


n = int(input())
arr = []
for i in range(n):
    temp = int(input().strip())
    arr.append(temp)
arr.sort()
for i in range(n):
    arr[i] = arr[i] * (n-i)
print(max(arr))
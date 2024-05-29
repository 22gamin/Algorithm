n = int(input())

memo = [0] * (n+1)

def dp(x):
    if x == 1 or x == 2:
        return x
    
    if x != 0 and memo[x] == 0:
        memo[x] = dp(x-2) + dp(x-1)
    
    return memo[x]

print(dp(n)%10007)
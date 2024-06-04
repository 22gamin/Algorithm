n = int(input())

memo = [0]*(n+1)

def Dp(x):
    
    if x == 1:
        return 1
    if x == 2:
        return 3
    if memo[x] == 0:
        memo[x] = (2*Dp(x-2) + Dp(x-1))
    return memo[x]

print(Dp(n)%10007)
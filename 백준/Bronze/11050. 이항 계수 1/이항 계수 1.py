
import sys
import math

input = sys.stdin.readline
n,k = map(int,input().split())

print(int(math.factorial(n)/(math.factorial(n-k)*math.factorial(k))))
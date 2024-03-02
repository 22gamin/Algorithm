import sys

input = sys.stdin.readline
n = int(input())
i = 0
while(1):
    i += 1
    if '666' in str(i):
        n -= 1
    if n == 0:
        print(i)
        break
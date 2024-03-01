import sys

input = sys.stdin.readline
N = int(input())

for i in range(N):
    arr = list(map(int,str(i)))

    if N == i + sum(arr):
        print(i)
        break

    if i == N-1:
        print(0)
N = int(input())
arr= list(map(int,input().split()))
arr_set = set(arr)
M = int(input())

arr2 = []
arr2= list(map(int,input().split()))

for j in arr2:
    if j in arr_set:
        print(1)
    else:
        print(0)
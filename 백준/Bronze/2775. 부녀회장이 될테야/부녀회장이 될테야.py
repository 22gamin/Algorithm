def hi(x,y):
    arr = []
    
    for i in range(k+1):
        cnt = 0
        if i == 0:
            for i in range(n+1):
                arr.append(i)
        else:
            for i in range(n+1):
                cnt += arr[i]
                arr[i] = cnt
    print(arr[n])

T = int(input())

for i in range(T): 
    k = int(input())
    n = int(input())
    hi(k,n)
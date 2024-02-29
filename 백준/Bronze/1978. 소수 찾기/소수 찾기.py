n = int(input())
arr = list(map(int,input().split()))
cnt=0


for i in arr:
    a = 0
    if i == 1:
        pass
    elif i ==2 or i == 3:
        cnt += 1

    else:
        for j in range(2,i-1):
            if i%j == 0:
                a += 1

        if a == 0:
            cnt += 1

print(cnt)
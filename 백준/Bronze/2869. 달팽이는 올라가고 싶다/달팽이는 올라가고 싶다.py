A, B, V = map(int, input().split())

# 다음 날 낮에 도착하면 됨
a = (V-A)//(A-B)

if (V-A) % (A-B) == 0:
    print(a+1)

elif ((V-A) % (A-B)) <= 24:
    print(a+2)
    
elif ((V-A)//(A-B))% 24 == 0:
    print(a + a//24+1)

else:
    print(a + a//24 + 2)
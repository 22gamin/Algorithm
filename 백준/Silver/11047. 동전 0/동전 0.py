#N,K 입력
N,K = map(int,input().split())

value=[]
for i in range(N):
    number=int(input())
    value.append(number)

value.sort(reverse=True)

count=0

for i in value:
    count += K//i
    K = K%i

print(count)   
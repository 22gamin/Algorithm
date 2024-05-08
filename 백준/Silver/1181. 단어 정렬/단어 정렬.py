# 입력 받기
N = int(input())
arr = []

for i in range(N):
    arr.append(input())

# set을 통해 중복 값 제거
arr_x = list(set(arr))

# 길이 순 -> 사전 순 정렬
arr_x.sort(key = lambda x: (len(x),x))

# 출력
for i in arr_x:
    print(i)
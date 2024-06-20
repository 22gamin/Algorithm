# 세로 * 가로 = brown + yellow
# yellow 가로 + yellow 가로 + 4 = brown
# 리턴 값 : [yellow + 가로 + 2, yellow + 세로 + 2]
# 개수가 주어짐
# yellow 가로 길이 : x, yellow 세로 길이 : y

# xy = yellow
# (x+2)(y+2) = brown

def solution(brown, yellow):
    
    s = brown+yellow
    arr = []
    for i in range(1,s):
        if (s%(i+2) == 0 and (yellow/i+2)*(i+2) == brown+yellow):
            print(i)
            arr.append([i+2,int(yellow/i)+2])
    
    answer = min(arr,key = lambda x : x[1])
    return answer
def solution(n):
    answer = 0
    
    # 자기 자신말고 안 나눠지는 수를 찾아야함
    for i in range(3,n+1):
        cnt = 0
        for j in range(2,i):
            if i%j == 0:
                cnt += 1
        if cnt != 0:
            answer += 1
            
            
    return answer
def solution(n):
    answer = 0
    
    # 6과 n의 최소공배수
    for i in range(1,1000000):
        if (n * i) % 6 == 0:            
            answer = n*i/6
            break
    
    return answer
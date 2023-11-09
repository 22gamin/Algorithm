def solution(n):
    answer = 0
    
    for i in range(1,n+1):
        answer += (i%2==0)*i
    return answer
def solution(a, b, n):
    answer = 0
    while n >= a:
        cnt = 0
        cnt += (n//a)*b
        answer += (n//a)*b
        n = cnt+ n%a
    
    
    return answer

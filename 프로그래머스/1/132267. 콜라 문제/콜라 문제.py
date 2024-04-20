# a병 주면 b 개를 줌
# 상빈이는 n개 가지고 있음
def solution(a, b, n):
    answer = 0
    while n >= a:
        cnt = 0
        cnt += (n//a)*b
        answer += (n//a)*b
        n = cnt+ n%a
    
    
    return answer
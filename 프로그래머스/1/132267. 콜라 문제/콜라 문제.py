def solution(a, b, n):
    answer = 0
    cnt = 0

    while(n >= a):
        cnt = n%a
        n = ((n//a)*b) 
        answer += n
        n += cnt
    return answer

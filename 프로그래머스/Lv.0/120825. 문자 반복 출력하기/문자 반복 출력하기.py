def solution(my_string, n):
    answer = ''
    lo = list(my_string)
    
    for i in lo:
        for j in range(n):
            answer += i
    return answer
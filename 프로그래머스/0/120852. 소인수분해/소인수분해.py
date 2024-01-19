def solution(n):
    answer = []
    prime_factor = []
    
    i = 2
    
    while i<= n:
        if n % i ==0:
            prime_factor.append(i)
            n = n//i
            
        else:
            i += 1
    
    for i in prime_factor:
        if i not in answer:
            answer.append(i)
    return answer
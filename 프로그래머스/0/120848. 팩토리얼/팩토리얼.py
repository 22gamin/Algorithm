import math

def solution(n):
    
    for i in range(11):
        if math.factorial(i) == n:
            answer = i
        
        elif math.factorial(i) < n:
            answer = i
            
            
    return answer
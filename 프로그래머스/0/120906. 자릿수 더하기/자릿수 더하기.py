def solution(n):
    answer = 0
    
    nums = list(map(int,str(n)))
    
    for i in nums:
        answer += i
        
    return answer
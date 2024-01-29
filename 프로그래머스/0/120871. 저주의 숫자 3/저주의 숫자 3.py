def solution(n):
    answer = 0
    cnt =0
    
    for i in range(1,9999):
        if i % 3 != 0 and '3' not in str(i):
            answer = i
            cnt += 1
        
        if cnt == n:
            break
            
    return answer
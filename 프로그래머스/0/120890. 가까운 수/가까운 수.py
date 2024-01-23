def solution(array, n):
    answer = 0
    cnt = 100
    array.sort()
    
    for i in array:
        if i == n:
            answer = i
            break
            
        elif i > n:
            if cnt > i-n:
                cnt = i-n
                answer = i
                
        else:
            if cnt > n-i:
                cnt = n-i
                answer = i
            
    return answer
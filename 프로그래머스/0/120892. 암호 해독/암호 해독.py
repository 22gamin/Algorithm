def solution(cipher, code):
    answer = ''
    cnt = 0
    
    for i in cipher:
        cnt += 1
        if cnt%code ==0:
            answer += i
        
        
    return answer
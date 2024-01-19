def solution(strlist):
    answer = []
    
    for i in strlist:
        cnt =0
        for j in i:
            cnt += 1
            
        answer.append(cnt)
            
    return answer
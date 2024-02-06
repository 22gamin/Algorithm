def solution(i, j, k):
    answer = 0
    
    for num in range(i,j+1):
        for li in list(str(num)):
            if li == str(k):
                answer += 1
                
    return answer
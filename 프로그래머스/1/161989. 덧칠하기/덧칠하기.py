def solution(n, m, section):
    
    answer = 1
    
    if m == 1:
        return len(section)
    
    first = section[0]
    
    for i in range(1,len(section)):

        if section[i] - first > m-1:
            answer += 1
            first = section[i]
            
    return answer
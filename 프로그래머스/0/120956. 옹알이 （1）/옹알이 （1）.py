def solution(babbling):
    answer = 0
    a = ''
    ba = ["aya", "ye", "woo", "ma"]
    
    for i in babbling:
        a = i
        for j in ba:
            if j in a:
                a = a.replace(j,'1')
        
        a = a.replace('1','')
        
        if a == '':
            answer += 1
        
               
    return answer
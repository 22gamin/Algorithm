def solution(before, after):
    
    for i in before:  
        for j in after:
            if i == j:
                before = before.replace(i,'',1)
                after = after.replace(i,'',1)
                break
            
    if before == '' and after == '':
        return 1
    else:
        return 0
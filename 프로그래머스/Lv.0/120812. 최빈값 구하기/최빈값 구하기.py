def solution(array):
    a = []
    maxs=[]
    s = 0
    t = 0
    
    # 중복 없는 리스트
    for i in array:
        if i not in a:
            a.append(i)
            
    for j in a:
        maxs.append(array.count(j))
        
        if s < array.count(j):
            s = array.count(j)
            t = j
        
    if maxs.count(s) > 1:
        return -1
    else:
        return t
    
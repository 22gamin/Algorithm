def solution(s):
    
    di =[]

    for i in s:
        if s.count(i) < 2:
            di.append(i)
    
    di.sort()
    return ''.join(di)
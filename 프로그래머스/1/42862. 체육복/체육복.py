def solution(n, lost, reserve):
    lost.sort()
    reserve.sort()
    
    lost_=lost[:]
    
    #여벌이 있지만 도둑 맞은 사람
    for i in lost:
        if i in reserve:
            reserve.remove(i)
            lost_.remove(i)
            
    for i in lost_:
        if i in reserve:
            reserve.remove(i)
        elif i-1 in reserve:
            reserve.remove(i-1)
        elif i+1 in reserve:
            reserve.remove(i+1)
        else:
            n -= 1

    return n if n >= 0 else 0
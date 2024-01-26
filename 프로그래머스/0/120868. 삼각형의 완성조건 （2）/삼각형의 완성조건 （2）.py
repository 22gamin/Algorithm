def solution(sides):
    answer = 0
    maxs = max(sides)
    
    # 가장 긴 변이 max값일 경우
    for i in range(1,maxs+1):
        if i > maxs - min(sides):
            answer += 1
    
    # 가장 긴 변이 sides값에 없는 경우
    for i in range(maxs+1,maxs + min(sides)+1):
        if i < maxs + min(sides):
            answer += 1
        else:
            break
            
    return answer
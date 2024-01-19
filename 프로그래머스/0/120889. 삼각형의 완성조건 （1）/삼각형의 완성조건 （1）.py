def solution(sides):
    answer = 0
    sides.sort()
    
    for i in range(len(sides)-1):
        if sides[i] <= sides[-1]:
            answer += sides[i]
    
    if answer > max(sides):
        return 1
    else:
        return 2
    
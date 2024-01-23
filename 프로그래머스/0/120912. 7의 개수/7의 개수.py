def solution(array):
    answer = 0
    
    for i in array:
        if str(7) in str(i):
            answer += str(i).count(str(7))
    return answer
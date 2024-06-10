def solution(nums):
    
    arr = list(set(nums))
    answer = 0
    
    if len(nums)/2 >= len(arr):
        answer = len(arr)
    else:
        answer = len(nums)/2
    
    return answer
def solution(num, k):
    answer = -1
    
    nums = list(map(int,str(num)))
    
    for i in range(len(nums)):
        if nums[i] == k:
            return i+1
    return answer
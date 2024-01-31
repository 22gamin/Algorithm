def solution(numbers, target):
    global answer
    answer = 0
    
    def dfs(idx,total):
        global answer
        if idx == len(numbers) and total == target:
            answer += 1
            return answer
        if idx == len(numbers):
            return
        
        dfs(idx+1,total+numbers[idx])
        dfs(idx+1,total-numbers[idx])
        
    dfs(0,0)       
    return answer
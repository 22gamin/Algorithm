def solution(skill, skill_trees):
    
    answer = 0
    
    for i in skill_trees:
        arr = []
        for j in skill:
            arr.append(i.find(j))
        
        # -1은 마지막부분만 존재할 수 있음
        # 숫자 차이가 어떻든 순서대로
        arr_ = sorted(arr)
        if -1 not in arr:
            if arr == arr_:
                answer += 1
                
        else:
            if arr[:len(arr)-arr.count(-1)] == arr_[arr_.count(-1):]:
                answer += 1
            
    return answer
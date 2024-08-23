# 맞은 개수 -> 최저순위
# 맞은 개수 + 0 개수 -> 최고 순위

def solution(lottos, win_nums):
    
    cnt = 0
    zeros = 0
    answer = []
    
    for i in lottos:
        if i in win_nums:
            cnt += 1
        if i == 0:
            zeros += 1
    
    # 최고 순위
    if cnt+zeros == 6:
        answer.append(1)
    elif cnt+zeros == 5:
        answer.append(2)
    elif cnt+zeros == 4:
        answer.append(3)
    elif cnt+zeros == 3:
        answer.append(4)
    elif cnt+zeros == 2:
        answer.append(5)
    else:
        answer.append(6)
    
    # 최저 순위
    if cnt == 6:
        answer.append(1)
    elif cnt == 5:
        answer.append(2)
    elif cnt == 4:
        answer.append(3)
    elif cnt == 3:
        answer.append(4)
    elif cnt == 2:
        answer.append(5)
    else:
        answer.append(6)
    

        
    return answer
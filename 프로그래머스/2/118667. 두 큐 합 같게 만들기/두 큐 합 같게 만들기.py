from collections import deque 

def solution(queue1, queue2):
    answer = 0
    hab = (sum(queue1) + sum(queue2))/2
    
    # 뺄 거 정하기
    if sum(queue1) >= sum(queue2):
        bel = deque(queue1)
        the = deque(queue2)

    else:
        bel = deque(queue2)
        the = deque(queue1)

    sum1 = sum(bel)
    sum2 = sum(the)
    s = len(queue1) + len(queue2) + 1
    

    while sum1 != sum2:
        
        # 같을 수 없는 경우
        if answer > s:
            return -1
        
        if sum1 > sum2:
            i = bel.popleft()
            the.append(i)
            
            sum1 -= i
            sum2 += i
            
        else:
            i = the.popleft()
            bel.append(i)
            
            sum2 -= i
            sum1 += i
            
        answer += 1
        
    return answer
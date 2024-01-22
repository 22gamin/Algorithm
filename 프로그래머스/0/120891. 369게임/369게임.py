def solution(order):
    answer = 0
    order_ = list(str(order))
    tsn = ['3','6','9']
    for i in order_:
        if i in tsn:
            answer += 1
        
    return answer
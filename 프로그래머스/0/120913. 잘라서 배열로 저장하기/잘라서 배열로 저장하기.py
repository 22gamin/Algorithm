def solution(my_str, n):
    answer = []
    answer_ = ''
    cnt = 0
    my_str_ = list(my_str)
    
    for i in range(len(my_str_)):
        cnt += 1
        answer_ += my_str_[i]
        
        if cnt == n:
            answer.append(answer_)
            answer_ = ''
            cnt = 0
        elif i == len(my_str_)-1:
            answer.append(answer_)
            
    return answer
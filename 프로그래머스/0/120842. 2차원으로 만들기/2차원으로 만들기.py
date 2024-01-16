def solution(num_list, n):
    answer = []
    answer_= []
    cnt = 0
    
    # n씩 끊어서 배열에 넣음 어떨까
    for i in num_list:
        answer_.append(i)
        cnt += 1
        if cnt == n:
            cnt = 0
            answer.append(answer_)
            answer_=[]
        
        
    return answer
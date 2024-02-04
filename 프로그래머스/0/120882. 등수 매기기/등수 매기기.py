def solution(score):
    answer = 0
    arg = []
    k=0
    cnt = 1
    
    for i in score:
        arg.append(((i[0] +i[1])/2,score.index(i)))
        
    arg.sort(reverse=True)
    print(arg)
    
    for num,s_idx in arg:
        if num == answer:
            score[s_idx] = k
            answer = num
            cnt += 1
        
        else:
            k += cnt
            score[s_idx] = k
            answer = num
            cnt = 1
            
            
    print(score)
    return score
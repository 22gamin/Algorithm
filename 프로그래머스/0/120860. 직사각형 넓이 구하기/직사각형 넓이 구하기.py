def solution(dots):
    answer = 0
    x=[]
    y=[]
    
    for i in dots:
        for j in range(len(i)):
            if j == 0:
                x.append(i[j])
            else:
                y.append(i[j])
    answer = (max(x)-min(x)) * (max(y)- min(y))
                
                
    return answer
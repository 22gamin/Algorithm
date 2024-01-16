def solution(age):
    answer = ''
    alpha=['a','b','c','d','e','f','g','h','i','j']
    answer_=[]
    
    age_= list(str(age))
    
    for i in age_:
        answer_.append(alpha[int(i)])
    
    answer = ''.join(answer_)
    
    return answer
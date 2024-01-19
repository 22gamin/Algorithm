def solution(my_string):
    answer = []
    
    my_string_=list(my_string)
    
    for i in my_string_:
        if i not in answer:
            answer.append(i)
        
    return ''.join(answer)
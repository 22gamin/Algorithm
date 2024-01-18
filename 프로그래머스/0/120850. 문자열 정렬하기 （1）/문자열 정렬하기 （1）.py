def solution(my_string):
    answer = []
    my_string_ = list(my_string)
    
    for i in my_string_:
        if i.isdigit() == True:
            answer.append(int(i))
            
    answer.sort()
            
    return answer
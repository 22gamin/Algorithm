def solution(my_string):
    answer = []
    mo = ['a','e','i','o','u']
    copy = list(my_string)
    
    
    for i in copy:
        if i not in mo:
            answer.append(i)
        
        
    return ''.join(answer)
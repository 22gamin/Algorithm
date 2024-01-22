def solution(my_string):
    answer = my_string.lower()
    
    my = list(answer)
    my.sort()
    
    return ''.join(my)
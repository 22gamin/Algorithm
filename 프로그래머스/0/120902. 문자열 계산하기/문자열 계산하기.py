def solution(my_string):
    answer = 0 
    my_str = list(my_string.split())
    
    for i in range(len(my_str)):
        if i == 0:
            answer += int(my_str[i])
            
        elif my_str[i] == '+':
            answer += int(my_str[i+1])
        
        elif my_str[i] == '-':
            answer -= int(my_str[i+1])
            
    return answer
def solution(my_string):
    answer = 0
    wait = ''
    
    my_string += "A"
    
    for i in my_string:
        if i.isdigit() == True:
            wait += i
            
        elif i.isalpha() == True and wait != '':
            answer += int(wait)
            wait =''
    
    return answer
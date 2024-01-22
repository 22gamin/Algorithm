def solution(my_string, num1, num2):
    my_string_ = list(my_string)
    
    num11 = my_string_[num1]
    num22 = my_string_[num2]
    
    del my_string_[num2]
    my_string_.insert(num2,num11)
    
    del my_string_[num1]
    my_string_.insert(num1,num22)
        
    return ''.join(my_string_)
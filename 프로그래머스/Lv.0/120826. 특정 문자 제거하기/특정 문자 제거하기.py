def solution(my_string, letter):
    answer = ''
    lo = list(my_string)
        
    while(1):
        if letter in lo:
            lo.remove(letter)
        else:
            break
    
    answer = ''.join(lo)
    return answer
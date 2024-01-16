def solution(rsp):
    answer = ''
    rsp_ = list(str(rsp))
    
    for i in rsp_:
        if int(i) == 2:
            answer += '0'
        elif int(i) == 0:
            answer += '5'
        else:
             answer += '2'
    
    return answer
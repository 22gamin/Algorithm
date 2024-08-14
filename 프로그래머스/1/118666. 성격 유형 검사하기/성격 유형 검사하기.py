# R/T, C/F, J/M, A/N => 7이 "매우 동의"
    
def score(num):
    if num < 4:
        return -(4-num)
    elif num == 4:
        return 0
    else:
        return num-4
    
    
def solution(survey, choices):
    
    arr = [0,0,0,0]
    
    for i in range(len(survey)):
        #R/T
        if survey[i] == "RT":
            arr[0] += score(choices[i])
        elif survey[i] == "TR":
            arr[0] -= score(choices[i])
        
        #C/F
        elif survey[i] == "CF":
            arr[1] += score(choices[i])
            
        elif survey[i] == "FC":
            arr[1] -= score(choices[i])
        
        #J/M
        elif survey[i] == "JM":
            arr[2] += score(choices[i])
        elif survey[i] == "MJ":
            arr[2] -= score(choices[i])
        
        #A/N
        elif survey[i] == "AN":
            arr[3] += score(choices[i])
        elif survey[i] == "NA":
            arr[3] -= score(choices[i])
    print('arr=',arr)
    
    s = ''
    result = [['R','T'],['C','F'],['J','M'],['A','N']]
    
    for i in range(len(arr)):
        if arr[i] <= 0:
            s += result[i][0]
        else:
            s += result[i][1]
    
    return s
            
            
            
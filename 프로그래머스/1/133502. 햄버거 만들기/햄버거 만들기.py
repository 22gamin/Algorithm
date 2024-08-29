# 1-빵, 2-야채, 3-고기
def solution(ingredient):
    answer = 0
    ham = []
    
    for i in ingredient:
        ham.append(i)
        if len(ham) > 3 and ham[-4:] == [1,2,3,1]:
            answer += 1
            del ham[-4:]
        
    return answer
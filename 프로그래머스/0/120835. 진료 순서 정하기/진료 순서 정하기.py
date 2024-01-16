def solution(emergency):
    answer = []
    emergency_ = sorted(emergency,reverse=True) #[76,24,3]
    
    for i in emergency:
        answer.append(emergency_.index(i)+1)
    
    return answer
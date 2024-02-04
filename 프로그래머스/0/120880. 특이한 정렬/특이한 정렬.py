def solution(numlist, n):
    answer = []
    
    for i in numlist:
        answer.append(abs(n-i))

    answer.sort()

    for i in range(len(answer)):
        if answer[i]+n in numlist:
            answer[i] = answer[i]+n
            numlist.remove(answer[i])
            
        elif n-answer[i] in numlist:
            answer[i] = n-answer[i]
            numlist.remove(answer[i])

    return answer


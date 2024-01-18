def solution(numbers):
    answer = 0
    maxs = []
    
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i != j and numbers[i]*numbers[j] not in maxs:
                maxs.append(numbers[i]*numbers[j])
    print(maxs)
    answer = max(maxs)
    return answer
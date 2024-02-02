def solution(array):
    answer = []
    a = 1234
    result = list(map(lambda x: x+1, [1,2,3,4,5]))
    print(result)
    answer.append(max(array))
    answer.append(array.index(max(array)))
    return answer
def solution(numbers):
    answer = []
    for i in numbers:
        answer.append(i*2)
    return answer


다른 풀이
def solution(numbers):
    return [num*2 for num in numbers]

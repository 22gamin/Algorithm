def solution(n):
    answer = 0
    
    # 인원 수가 7의 배수 기준으로 피자 개수 생각
    if n % 7 == 0:
        answer = n//7

    else:
        answer = n//7+1    
    return answer
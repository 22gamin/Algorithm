def solution(a, b):
    answer = 0
    a_ = []
    b_ = []
    a_b = []
    
    # a의 공약수 구하기
    for i in range(1,a+1):
        if a%i == 0:
            a_.append(i)
    
    # b의 공약수 구하기
    for i in range(1,b+1):
        if b%i == 0:
            b_.append(i)
    
    # a와 b의 공약수 찾기
    for i in a_:
        if i in b_:
            a_b.append(i)
    
    q = int(b/max(a_b))
    
    # 유한소수 조건
    while q % 2 == 0:
        q //= 2
    while q % 5 == 0:
        q //= 5
    
    if q == 1:
        return 1
    elif q != 1:
        return 2
    
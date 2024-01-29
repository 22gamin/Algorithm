from itertools import combinations

def solution(dots):
    answer = 0
    
    combi = list(combinations(dots, 2)) # 네 점에서 두 개씩 조합
    # 조합의 결과는 정렬되어 나오기 때문에 대칭으로 짝을 이룸 -> 그러므로 절반까지만 for문
    for i in range(len(combi)//2): 
        dx1, dy1 = combi[i][0][0] - combi[i][1][0], combi[i][0][1]-combi[i][1][1]
        dx2, dy2 = combi[-(i+1)][0][0]-combi[-(i+1)][1][0], combi[-(i+1)][0][1]-combi[-(i+1)][1][1]
        d1 = dy1/dx1 # 직선1 기울기
        d2 = dy2/dx2 # 직선2 기울기
        
        if d1 == d2: # 두 직선의 기울기가 같으면(=평행) 1
            answer = 1
            break
        answer = 0 # 어떠한 경우에도 평행하지 않으면 0

    return answer
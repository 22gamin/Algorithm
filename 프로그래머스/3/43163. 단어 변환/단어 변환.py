from collections import deque

def solution(begin, target, words):
    # target이 words에 없는 경우
    if target not in words:
        return 0
    
    # 단어가 하나만 다른지 확인하는 함수
    def countDif(x, y):
        cnt = 0
        for i in range(len(x)):
            if x[i] != y[i]:
                cnt += 1
            if cnt == 2:
                return False
        return True
    
    visited = [0] * len(words)
    q = deque([begin])
    count = 0
    
    while q:
        count += 1
        for _ in range(len(q)):  # 현재 큐의 모든 요소를 처리
            v = q.popleft()
            
            for i in range(len(words)):
                if visited[i] == 0 and countDif(v, words[i]):
                    if words[i] == target:
                        return count
                    visited[i] = 1
                    q.append(words[i])
                    
    return 0
from collections import deque

def solution(n, computers):
    
    visited = [0] * n
    cnt = 0
    
    def bfs(x):
        q = deque([x])
        
        while q:
            y = q.popleft()
            for i in range(n):
                if computers[y][i] == 1 and visited[i] == 0 and y != i:
                    visited[i] = 1
                    q.append(i)
    
    for i in range(n):
        if visited[i] == 0:
            bfs(i)
            cnt += 1
        
    return cnt

# def solution(n, computers):
#     visited = [0] * n
#     cnt = 0
    
#     def dfs(x):
#         visited[x] = 1
#         for i in range(n):
#             if computers[x][i] == 1 and visited[i] == 0 and x != i:
#                 dfs(i)
                
                
#     for i in range(n):
#         if visited[i] == 0:
#             dfs(i)
#             cnt +=1
#     return cnt
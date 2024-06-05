from collections import deque

def solution(maps):
    
    n = len(maps) # 행
    m = len(maps[0]) # 열
    
    visited = [[0]*(m) for _ in range(n)]
    
    dx = [0,1,0,-1]
    dy = [1,0,-1,0]
    
    q = deque([(0,0)])
    
    while q:
        x,y = q.popleft()
        
        for i in range(4):
            ddx = x + dx[i]
            ddy = y + dy[i]
            
            if ddx < 0 or ddx >= n or ddy < 0 or ddy >= m:
                continue
                
            if maps[ddx][ddy]==1 and visited[ddx][ddy] == 0:
                visited[ddx][ddy] = 1
                q.append((ddx,ddy))
                maps[ddx][ddy] = maps[x][y] + 1
    

    if visited[n-1][m-1] == 0:
        return -1
    return maps[n-1][m-1]




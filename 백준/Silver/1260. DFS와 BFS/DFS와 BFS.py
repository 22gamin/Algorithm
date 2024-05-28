from collections import deque

x,y,z = map(int, input().split())
graph = [ [0]*(x+1) for _ in range(x+1)]
visited = [0] * (x+1)
arr = []
for i in range(y):
    a, b = map(int,input().split())
    graph[a][b] = graph[b][a] = 1

def dfs(graph, visited, start):
    visited[start] = 1
    print(start, end=' ')

    for i in range(1,x+1):
        if graph[start][i] == 1 and visited[i] == 0:
            visited[i] = 1
            dfs(graph,visited,i)
    

def bfs(graph, visited, start):
    q = deque([start])
    visited[start] = 1

    while q:
        v = q.popleft()
        print(v, end=' ')
        for i in range(1,x+1):
            if graph[v][i] == 1 and visited[i] == 0:
                q.append(i)
                visited[i] = 1
                
dfs(graph, visited, z)
print("")

visited = [0] * (x+1)
bfs(graph,visited,z)
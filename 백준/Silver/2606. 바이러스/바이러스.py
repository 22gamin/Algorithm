# 입력 받기
n = int(input())
m = int(input())

# 노드 표시
graph = [[0]*(n+1) for _ in range(n+1)]
for i in range(m):
    a,b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

# visited
visited = [0] * (n+1)

def dfs(graph, visited, i):
    count = 1
    visited[i] = 1
    
    for j in range(1,n+1):
        if graph[i][j] == 1 and visited[j] == 0:
            count += dfs(graph, visited, j)
    
    return count

print(dfs(graph,visited,1) - 1)
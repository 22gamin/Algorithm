def solution(park, routes):
    # 공원의 세로와 가로 길이
    H = len(park)
    W = len(park[0])
    
    # 시작 위치 찾기
    for i in range(H):
        if 'S' in park[i]:
            x, y = i, park[i].index('S')
            break
    
    # 이동 방향 딕셔너리
    direction_map = {
        'N': (-1, 0),  # 북쪽은 행 감소
        'S': (1, 0),   # 남쪽은 행 증가
        'W': (0, -1),  # 서쪽은 열 감소
        'E': (0, 1)    # 동쪽은 열 증가
    }
    
    # 각 명령을 처리
    for route in routes:
        direction, distance = route.split()
        distance = int(distance)
        dx, dy = direction_map[direction]
        
        # 현재 위치
        nx, ny = x, y
        
        # 명령을 수행할 수 있는지 확인
        valid_move = True
        for _ in range(distance):
            nx += dx
            ny += dy
            # 공원을 벗어나는지 확인
            if not (0 <= nx < H and 0 <= ny < W):
                valid_move = False
                break
            # 장애물이 있는지 확인
            if park[nx][ny] == 'X':
                valid_move = False
                break
        
        if valid_move:
            x, y = nx, ny
    
    return [x, y]

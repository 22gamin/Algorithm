def solution(keyinput, board):
    answer = []
    x = 0
    y = 0
    u = (board[1]-1)/2
    d = (board[0]-1)/2
    
    if len(keyinput) == 0:
        answer.append(0)
        answer.append(0)
    else:
        for i in range(len(keyinput)):
            if keyinput[i] == "up" and  y < u:
                y += 1
            elif keyinput[i] == "down" and y > -u:
                y -= 1

            elif keyinput[i] == "left" and x > -d:
                x -= 1

            elif keyinput[i] == "right" and x < d:
                x += 1

            if i == len(keyinput)-1:
                answer.append(x)
                answer.append(y)
    
    return answer
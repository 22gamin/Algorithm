def solution(board, moves):
    answer = 0
    arr = []
    
    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                if len(arr) != 0 and arr[-1] == board[j][i-1]:           
                    answer += 2
                    arr.pop()
                    board[j][i-1] = 0
                    break

                arr.append(board[j][i-1])
                board[j][i-1] = 0
                break
                # 4 3 1 1 3 2 4

                
    return answer
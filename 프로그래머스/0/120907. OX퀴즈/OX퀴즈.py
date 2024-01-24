def solution(quiz):
    answer = []
    cnt = 0
    
    for i in quiz:
        a = list(i.split())

        for j in range(len(a)):
            if a[j] == '+':
                cnt = int(a[j-1])+int(a[j+1])
            elif a[j] == '-':
                cnt = int(a[j-1])-int(a[j+1])
            elif a[j] == '=':
                if cnt == int(a[j+1]):
                    answer.append("O")
                elif cnt != int(a[j+1]):
                    answer.append("X")
        
    return answer
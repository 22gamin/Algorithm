def solution(X, Y):
    arr = []
    XX = set(X)
    answer = ''
    for i in XX:
        x = X.count(i)
        y = Y.count(i)
        
        for _ in range(min(x,y)):
            arr.append(i)
    
    arr.sort(reverse=True)

    if len(arr) == 0:
        return "-1"
    elif arr[0] == "0":
        return "0"

    else:
        for i in arr:
            answer += i
    return answer
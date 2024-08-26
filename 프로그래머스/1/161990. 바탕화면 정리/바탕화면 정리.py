def solution(wallpaper):
    
    arr = []
    
    for i in range(len(wallpaper)):
        card = list(wallpaper[i])
        for j in range(len(card)):
            if card[j] == "#":
                arr.append((i,j))
    
    dap = []
    
    # 가장 작은 (x,y)와 가장 큰 (x,y) 구하기  
    dap.append(arr[0][0])
    dap.append(arr[len(arr)-1][0]+1)

    arr.sort(key = lambda x: x[1])
    dap.insert(1,arr[0][1])
    dap.append(arr[len(arr)-1][1]+1)
    
    
    return dap
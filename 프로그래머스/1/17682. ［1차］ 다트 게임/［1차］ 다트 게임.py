def solution(dartResult):
    
    # 중간 결과를 리스트에 저장해놓기
    arr = []
    
    for i in range(len(dartResult)):
        # 숫자 10
        if dartResult[i] == "1" and dartResult[i+1] == "0":
            arr.append(10)
            
        # 다른 숫자
        elif dartResult[i].isdigit() == True and dartResult[i-1] != "1":
            arr.append(int(dartResult[i]))
            
        # S,D,T
        elif dartResult[i] == "D":
            arr[len(arr)-1] *= arr[len(arr)-1]
        elif dartResult[i] == "T":
            arr[len(arr)-1] = arr[len(arr)-1] * arr[len(arr)-1] * arr[len(arr)-1]
        
        # *, #
        elif dartResult[i] == "*":
            if len(arr) == 1:
                arr[0] *= 2
            elif len(arr) == 2:
                arr[0] *= 2
                arr[1] *= 2
            elif len(arr) == 3:
                arr[1] *= 2
                arr[2] *= 2
                
        elif dartResult[i] == "#":
            arr[len(arr)-1] *= (-1)
        
        
        
        
    return sum(arr)
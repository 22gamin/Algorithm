def solution(n, arr1, arr2):
    
    sum_arr = []
    arr = []

    for i in range(n):
        sum_arr.append(bin(arr1[i] | arr2[i])[2:].zfill(n))
    
    for i in sum_arr:
        answer = ''
        for j in i:
            if j == "1":
                answer += "#"
            else:
                answer += " "
        arr.append(answer)
                
    return arr
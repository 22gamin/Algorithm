# def solution(array, n):
#     answer = 0
#     answer_ = 0
    
#     array.sort()
    
#     for i in array:
#         if n == i:
#             answer = i
#             break
#         elif n < i:
#             if answer_ < i-n:
#                 answer = i
#                 answer_ = i-n
#                 print(i,i-n)
                
#             elif( answer_ == i-n):
#                 continue
#         else: 
#             if answer_ < n-i:
#                 answer = i
#                 answer_ = n-i
#                 print(i,n-i)
                
#             elif(answer_ == n-i):
#                 continue
                
#     return answer

def solution(array, n):
    array.sort()
    answer = array[0]
    x = abs(n - array[0])
    for e in array:
        if x > abs(n - e):
            x = abs(n - e)
            answer = e
    return answer
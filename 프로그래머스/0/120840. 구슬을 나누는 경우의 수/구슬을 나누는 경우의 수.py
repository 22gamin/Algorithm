def solution(balls, share):

    n = 1
    m = 1
    n_m = 1
    
    for i in range(1,balls+1):
        n *= i

        
    for i in range(1,share+1):
        m *= i
        
    for i in range(1,balls-share+1):
        n_m *= i
        
    answer = n/(m*n_m)
    print(n,m,n_m)
    return answer
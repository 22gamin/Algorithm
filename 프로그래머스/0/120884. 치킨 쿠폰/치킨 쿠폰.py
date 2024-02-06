def solution(chicken):
    cnt = 0
    answer = 0
    cupon = chicken
        
    while cupon >= 10:
        cnt += cupon // 10
        
        ser = cupon // 10
        vice = cupon % 10
        
        cupon = ser + vice
        
    return cnt
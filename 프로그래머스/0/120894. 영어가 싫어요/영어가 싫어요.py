def solution(numbers):
    answer = ''
    numbers_a = { "zero":0, "one":1, "two":2, "three":3, "four":4, "five":5, "six":6, "seven":7, "eight":8, "nine":9 }
    alpha = ''
    
    for i in numbers:
        alpha += i
        if alpha in numbers_a:
            answer += str(numbers_a[alpha])
            alpha = ''
            
    
    return int(answer)
def solution(numbers, hand):
    answer = ''
    left = 10
    right = 12
    
    
    for i in numbers:
        if i == 0:
            i = 11
        if i == 1 or i == 4 or i == 7:
            answer += "L"
            left = i
            
        elif i == 3 or i == 6 or i == 9:
            answer += "R"
            right = i
        
        elif i == 2 or i == 5 or i == 8 or i == 11:
            if abs(i - right)//3+abs(i - right)%3 < abs(i - left)//3+abs(i - left)%3:
                answer += "R"
                right = i
                
            elif abs(i - left)//3+abs(i - left)%3 < abs(i - right)//3+abs(i - right)%3:
                answer += "L"
                left = i
            else:
                if hand == "right":
                    answer += "R"
                    right = i
                else:
                    answer += "L"
                    left = i
        
    return answer
# 선물을 더 많이 주면 다음에 걔한테 하나 받음
# 기록이 없거나 수가 같으면 선물지수가 더 큰 사람이 작은 사람한테 줌
# 선물지수는 이번 달까지 (자신이 친구들에게 준 선물) - (받은 선물의 수) 
# 선물 지수조차 같으면 선물을 주고 받지 않음

# 선물을 가장 많이 받을 친구가 받을 선물의 수를 알고 싶음

# def solution(friends, gifts):
    
#     # friends 순서로 2차원 배열 만들기
#     arr = [[0] * len(friends) for _ in range(len(friends))]
    
#     # gift 이름을 friends에 놓인 숫자 배열로 바꾸기
#     for i in gifts:
#         gift = i.split()
#         print(gift)
        
            
    
    
#     return arr

def solution(friends, gifts):
    # 선물 준 횟수와 받은 횟수를 기록
    given = {friend: 0 for friend in friends}
    received = {friend: 0 for friend in friends}
    
    # 선물 주고 받은 기록 저장
    for gift in gifts:
        giver, receiver = gift.split()
        given[giver] += 1
        received[receiver] += 1
    
    # 다음 달에 받을 선물 수 계산
    next_month_gifts = {friend: 0 for friend in friends}
    
    for i in range(len(friends)):
        for j in range(i + 1, len(friends)):
            friend1 = friends[i]
            friend2 = friends[j]
            
            # friend1 -> friend2 선물 횟수와 반대 경우의 횟수 계산
            gift_f1_to_f2 = sum(1 for gift in gifts if gift == f"{friend1} {friend2}")
            gift_f2_to_f1 = sum(1 for gift in gifts if gift == f"{friend2} {friend1}")
            
            if gift_f1_to_f2 > gift_f2_to_f1:
                next_month_gifts[friend1] += 1
            elif gift_f1_to_f2 < gift_f2_to_f1:
                next_month_gifts[friend2] += 1
            else:
                # 선물 횟수가 같은 경우, 선물 지수를 비교
                score1 = given[friend1] - received[friend1]
                score2 = given[friend2] - received[friend2]
                
                if score1 > score2:
                    next_month_gifts[friend1] += 1
                elif score1 < score2:
                    next_month_gifts[friend2] += 1
                # else: 선물 지수도 같으면 아무도 선물 못 받음
    
    return max(next_month_gifts.values())

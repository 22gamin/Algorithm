# k번 다른 사람에게 신고되면 정지 -> 정지되면 신고한 사람들이 멩;ㄹ을 받음
# 각 유저 별로 받은 결과 메일 수 배열 리턴
# 한 사람당 한 사람을 신고할 수 있음

def solution(id_list, report, k):
    
    # 신고 당한 횟수
    reported = { user: 0 for user in id_list }
    # 신고한 유저 기록
    reporting = { user: [] for user in id_list }
    
    for i in report:
        arr = list(i.split())
        
        # 신고한 유저 추가
        if arr[1] not in reporting[arr[0]]: 
            reporting[arr[0]].append(arr[1])
            
    # 신고 당한 횟수 더하기
    for user in id_list:
        print(user)
        for reports in reporting[user]:
            reported[reports] += 1
        
    
    # 정지된 사람들 목록
    stop_list = []
    
    for i in reported:
        if reported[i] >= k:
            stop_list.append(i)

    # 메일 발송
    arr = []
    for i in id_list:
        answer = 0
        for j in reporting[i]:
            if j in stop_list:
                answer += 1
        arr.append(answer)
        
        
    return arr
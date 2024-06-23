def solution(record):
    dic = {}
    answer = []
    records = [i.split() for i in record]
    for i in record:
        arr = list(i.split())
        
        if arr[0] == 'Enter':
            # 나갔다가 들어온 경우 확인
            if arr[1] in dic or arr[1] not in dic:
                dic[arr[1]] = arr[2]
            
        elif arr[0] == 'Change':
            # 방 안에서 바꾼 경우
            if arr[1] in dic:
                dic[arr[1]] = arr[2]

    # 말 붙이기
    for i in records:
        re = ''

        if i[0] == 'Enter':
            re = dic[i[1]] + "님이 들어왔습니다."
            answer.append(re)

        elif i[0] == 'Leave':
            re = dic[i[1]] + "님이 나갔습니다."
            answer.append(re)
    
    return answer
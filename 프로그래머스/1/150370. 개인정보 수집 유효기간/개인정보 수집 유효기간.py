def convert_to_days(year, month, day):
    # 연도를 일수로 변환: 1년 = 12 * 28일
    return year * 12 * 28 + month * 28 + day

def solution(today, terms, privacies):
    # 오늘 날짜를 연, 월, 일로 분해
    today_year, today_month, today_day = map(int, today.split('.'))
    today_days = convert_to_days(today_year, today_month, today_day)
    
    # 약관 정보를 딕셔너리로 변환
    terms_dict = {}
    for term in terms:
        term_type, duration = term.split()
        terms_dict[term_type] = int(duration)
    
    # 파기해야 할 개인정보 번호를 저장할 리스트
    result = []
    
    for idx, privacy in enumerate(privacies):
        privacy_date, privacy_type = privacy.split()
        privacy_year, privacy_month, privacy_day = map(int, privacy_date.split('.'))
        
        # 약관에 따른 유효기간 더하기
        duration = terms_dict[privacy_type]
        privacy_month += duration
        
        # 달(month)을 처리하기 위해 총 일수로 변환
        privacy_days = convert_to_days(privacy_year, privacy_month, privacy_day)
        
        # 파기 여부 확인 (오늘 날짜와 비교)
        if privacy_days <= today_days:
            result.append(idx + 1)
    
    return result

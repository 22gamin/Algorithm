def solution(num_list):

    num_list.reverse()
    answer = num_list
    
    return answer

# answer = num_list.reverse() 의 값이 null이 출력되는데 
# num_list.reverse()는 원래 num_list값을 변경해줄 뿐 아무런 값이 반환되지 않기 때문에
# num_list.reverse()는 아무런 값이 없고 num_list를 사용해야 바뀐 배열을 쓸 수 있음

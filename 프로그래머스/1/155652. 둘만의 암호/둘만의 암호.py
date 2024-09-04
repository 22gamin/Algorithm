def solution(s, skip, index):
    answer = ''
    alpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    for i in skip:
        alpha.remove(i)
    
    for j in s:
        cnt = alpha.index(j) + index
        answer += alpha[cnt%(len(alpha))]
    
    return answer
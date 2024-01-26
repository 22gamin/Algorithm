def solution(spell, dic):
    answer = 0
    words = []
    
    for i in spell:
        for j in dic:
            if i in j:
                words.append(j)
    
    for i in range(len(words)):
        if words.count(words[i]) == len(spell):
            return 1
        else:
            answer = 2
    return answer
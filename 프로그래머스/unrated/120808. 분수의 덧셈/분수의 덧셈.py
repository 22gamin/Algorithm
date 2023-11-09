from fractions import Fraction

def solution(numer1, denom1, numer2, denom2):
    answer = []
    numer_add = numer1*denom2 + numer2*denom1
    denom_add = denom1*denom2
    
    a = Fraction(numer_add,denom_add)
    answer.append(a.numerator)
    answer.append(a.denominator)
    
    return answer
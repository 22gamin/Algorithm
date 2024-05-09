answer = []

while 1:
    arr = list(input())

    if arr[0] == '0':
        break
    if arr == list(reversed(arr)):
        answer.append('yes')
    else:
        answer.append('no')
    arr = []

for i in answer:
    print(i)
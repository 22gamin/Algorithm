n, m = map(int, input().split())
arr= [list(input()) for i in range(n)]


min_values = []

for a in range(n-7):
    for b in range(m-7):
        first_b = 0
        first_w = 0

        for i in range(8):
            for j in range(8):
                if (i+j)%2 == 0:
                    if arr[a+i][b+j] == "B":
                        first_w += 1
                    if arr[a+i][b+j] == "W":
                        first_b += 1
                else:
                    if arr[a+i][b+j] == "W":
                        first_w += 1
                    if arr[a+i][b+j] == "B":
                        first_b += 1
        min_values.append(first_b)
        min_values.append(first_w)
        

print(min(min_values))
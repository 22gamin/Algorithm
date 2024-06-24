s = input()

arr = ["pi", "ka", "chu"]


for i in arr: 
    if i in s: 
        s = s.replace(i,"A")

for i in s:
    if i != "A":
        print("NO")
        exit()
print("YES")
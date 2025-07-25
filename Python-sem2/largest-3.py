n1 = int(input("Number1"))
n2 = int(input("Number2"))
n3 = int(input("Number3"))
count =0

tup = (n1, n2, n3)
for n in tup:
    if n1>=n:
        count+=1
        continue
    e
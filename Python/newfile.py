def print_pattern(n):
    for i in range(n):
        num = i * (i + 1) // 2 + 1
        for j in range(i + 1):
            print(num, end=" ")
            num -= (i - j)
        print()

print_pattern(6)
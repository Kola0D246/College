num1 = int(input("Enter first number:"))
num2 = int(input("Enter second number:"))

print("Add |", num1+num2)
print("Sub |", num1-num2)
print("Mul |", num1*num2)
try:
    print("Div |", num1/num2)
    print("Mod |", num1%num2)
    print("Floor Div |", num1//num2)
except ZeroDivisionError:
    print("Cannot divide by Zero!")

print("Power |", num1**num2)

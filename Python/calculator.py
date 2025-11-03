num1 = float(input("Enter first number:"))
num2 = float(input("Enter second number:"))
opr = input("Enter operator (+,-,*,/,%,//,**):")

if opr == '+':
    print("Add |", num1+num2)
elif opr == '-':
    print("Sub |", num1-num2)
elif opr == '*':
    print("Mul |", num1*num2)
elif opr == '/':
    try:
        print("Div |", num1/num2)
    except ZeroDivisionError:
        print("Cannot divide by Zero!")
elif opr == '%':
    try:
        print("Mod |", num1%num2)
    except ZeroDivisionError:
        print("Cannot divide by Zero!")
elif opr == '//':
    try:
        print("Floor Div |", num1//num2)
    except ZeroDivisionError:
        print("Cannot divide by Zero!")
elif opr == '**':
    print("Power |", num1**num2)
else:
    print("Incorrect operator given")

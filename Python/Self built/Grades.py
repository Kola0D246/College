""" Check your grades for the marks you scored in your test
    A+ for marks between 95 to 100
    A for marks between 90 to 94
    B for marks between 80 to 89
    C for marks between 60 to 79
    D for marks between 45 to 59
    E for marks between 33 to 44
    F for marks between 33 to 0

Note:- The number get round off to the next higher integer and not lower integer.
"""

print ("What did you score in your test? Check your grades between A and F.")

subject = input("Name your subject:")
marks = float(input("What marks do you score?:"))
roundoff = ((marks*-1)//1)*(-1)

if roundoff >= 95 and roundoff <= 100:
    print("Awesome! With score of", marks, "in", subject, "you are in grade A+")
elif roundoff >= 90 and roundoff < 95:
    print("Great! With score of", marks, "in", subject, "you are in grade A")
elif roundoff >= 80 and roundoff < 90:
    print("Good work, my friend! With score of", marks, "in", subject, "you are in grade B")
elif roundoff >= 60 and roundoff < 80:
    print("Not so bad! With score of", marks, "in", subject, "you are in grade C. There still space for improvement though.")
elif roundoff >= 45 and roundoff < 60:
    print("It okay! With score of", marks, "in", subject, "you are in grade D. Work hard next time.")
elif roundoff >= 33 and roundoff < 45:
    print("That's a close one! With score of", marks, "in", subject, "you are in grade E. You need to work hard, buddy")
elif roundoff >= 0 and roundoff < 33:
    print("Oopsie! With score of", marks, "in", subject, "you are in grade F. But dont worry my friend, every failure is followed by success if you are determined and work hard.")
else:
    print("There seems to be an error in the score you enter. Please try again and enter your score between 0 to 100")


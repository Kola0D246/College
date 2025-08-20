""" Input your age and check whether you are eligible to vote.
    Only people who are older than or equal to 18 years are eligible to vote.
    Note:-  This program uses clever if syntax for Ternary operator.
            Syntax:- <var> = (<false_value>, <True_value>) [<condition>]
"""

print("Tell us your age to find whether you are eligible to vote.")

age = int(input("What is your age?:"))
eligibilty = ("eligible", "not eligible") [age < 18]
print("Since, you are", age, "years old, you are", eligibilty, "to vote.")

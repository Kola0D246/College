""" Format of storage of grade values
dictionary ={
    "subject1":[total-num-of-grade, ("grade1", upper-lim, lower-lim), ("grade2", upper-lim, lower-lim), ...]
    "subject2":[total-num-of-grade, ("grade1", upper-lim, lower-lim), ("grade2", upper-lim, lower-lim), ...]
    "subject3":[total-num-of-grade, ("grade1", upper-lim, lower-lim), ("grade2", upper-lim, lower-lim), ...]
    ...
}
"""

class GradeSheet:
    '''Class to manage the grading system'''
    def __init__(self):
        self.grades = ('A+', 'A', 'B', 'C', 'D', 'E', 'F')
        self.bound = (95, 90, 80, 60, 45, 33, 0)

    def get_grade(self, marks):
        if marks < 0 or marks > 100:
            raise ValueError("Marks must be between 0 and 100.")
        i = 0
        while i < len(self.bound):
            if marks >= self.bound[i]: return self.grades[i]
            i += 1

    def add_grade(self, grade, lower_limit):
        if grade in self.grades:
            raise ValueError("Grade already exists.")
        i = 0
        while i < len(self.bound):
            if lower_limit < self.bound[i]:
                self.grades = self.grades.insert(i, grade)
                self.bound = self.bound.insert(i, lower_limit)
                return
            i += 1

class Reportcard():
    sub = []
    def __init__(self):
        self.info = {}
        self.score = {
            'Hindi': None, 
            'English': None,
            'Maths': None,
            'Science': None,
            'Social Studies': None
            }

    def update(self, attr_name):
        '''To update all the info/score one by one
        To update specific info use <instance>.info[<index>] or <instance>.info[<index>]
        
        usage:
        update("info") to update self.info
        update("score") to update self.score
        '''
        print("loading...", attr_name)
        for i in attr_name:
            if attr_name != None:
                print(f"{i} = {attr_name[i]}")
                inp = input("Do you want to update this info? (Y/y):")
                if inp != 'Y' or inp != 'y':
                    continue
            attr_name[i] = input(f"Enter {i}:")

    def print(self, attr_name):
        





'''
Grade_dict = {}
def add_sub():
    sub = input("Name of subject:")
    num_of_grade = int(input("How many grades are there in total?"))
    lst_grade = [num_of_grade]
    
    print("Please enter the name of grade from highest to lowest. Also enter the upper limit and lower limit for each grade respectively.")
    for i in range(1,num_of_grade+1):
        grade = input("Grade "+str(i)+":")
        upper_lim = int(input("Enter upper limit for "+grade+". (This will not be included except for the highest grade):"))
        lower_lim = int(input("Enter lower limit for "+grade+":"))
        lst_grade.append([grade, upper_lim, lower_lim])
    
    Grade_dict[sub] = lst_grade

def remove_sub(sub):
    del Grade_dict[sub]

def edit(sub):
    #Edit only some grade and their range value in subject without changing entire values
    pass

def show(sub):
    print("Here's what the grading system looks like in", sub)
    print("Garde    Marks Range")
    for grade in Grade_dict[sub]:
        if type(grade) != list:continue
        print (grade[0]+"           "+str(grade[1])+":"+str(grade[2]))
    print("NOTE:- The upper limit value for each grade is not included inside the range except for the highest grade.")

def showall():
    for sub in Grade_dict:
        print("Subject Name:", sub)
        show(sub)

def check_grade():
    """ Check what grade you got based on your marks.
        Note:- The number get round off to the next higher integer.
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
        '''
class Student:
    def __init__(self, name, clas, Rollno, dob):
        self.name = name
        self.clas = clas
        self.Rollno = Rollno
        self.dob = dob

S1 = Student()
S2 = Student()
print(S1, S2.Rollno)
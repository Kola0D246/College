import sqlite3      #to store and manage userprofile data
import getpass      #to enter hidden password
import bcrypt       #to hash password


class User:
  def __init__(self):                   #This creates a new user and password
    self.Username = input("Username:")
    self.Password = getpass.getpass("Password:")
    self.Profile = {                    #Key = Feild name || Value = Feild Entry
      "Username": self.Username,
      "Fullname": None,
      "DOB (dd/mm/yyyy)": None,
      "Branch": None
    }

  def SetProfile(self):
    for field in self.Profile:
      if field != "Username":
        self.Profile[field] = input(field + ':')

  def EditProfile(self, field):
    inp = input(field + ':')
    if inp != '':
      self.Profile[field] = inp

  def ShowProfile(self):
    print(self.Profile)



user1 = User()
user1.SetProfile()
user1.ShowProfile()
#UseSQLite to store objects
#Add login and register functions
#Add password hashing
#Add password recovery
#Add password change
#Add
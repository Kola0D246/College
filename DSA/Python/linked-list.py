class node:
  def __init__(self, value, double= False):
    self.value= value
    self.next= None
    if double:
      self.prev= None

class linked_list:
  def __init__(self, size, circular= False):
    self.head= None
    self.tail= None
    


  def insert(self, value, position=0, double= False):
    new = node(value, double)
    new.next = self.head
    self.head = new

  def delete(self, size, double= False)
    

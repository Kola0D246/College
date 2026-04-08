class Stack:
    def __init__(self):
        self.Stlist = []
        
    def push(self, value):
    	self.Stlist.append(value)
    	
    def pop(self):
    	if isEmpty(self):
        	print("Stack is empty")
    	else:
        	return self.Stlist.pop()
        	
    def peek(self):
        if isEmpty(self):
        	print("Stack is empty")
    	else:
        	return self.Stlist[-1]
        	
    def isEmpty(self):
    	if len(self.Stlist) == 0:
    		return True
    	return False
    	
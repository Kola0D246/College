'''Greedy Best First Search'''

### DATA STRUCTURES ###

class Graph:
    def __init__(self):
        self.nodes = []
        self.estimateCosts = {}
        self.connections = {}

    def checkNode(self, label):
        return label in self.nodes
    
    def addNode(self, label):
        if self.checkNode(label):
            print(f"{label} is already a node. Give different label")
            return
        self.nodes.append(label)
        self.estimateCosts[label] = 0
        self.connections[label] = []

    def delNode(self, label):
        if self.checkNode(label):
            print(f"{label} not found in {self}")
            return
        self.nodes.remove(label)
        del self.estimateCosts[label]
        del self.connections[label]
            
    def updateEstCost(self, label, estimateCost):
        if self.checkNode(label):
            print(f"{label} not found in {self}")
            return
        self.estimateCosts[label] = estimateCost

    def connectNodes(self, label1, label2, direct=True):
        if self.checkNode(label1):
            print(f"{label1} not found in {self}")
            return
        elif self.checkNode(label2):
            print(f"{label1} not found in {self}")
            return
        self.connections[label1].append(label2)
        if not direct:
            self.connections[label2].append(label1)

            
        


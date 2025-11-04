# Best First Search

class Node:
    """Manage attributes and methods related to individual nodes"""
    def __init__(self, myLabel:str, estimatedCost=0):
        self.myLabel = myLabel
        self.estimatedCost = estimatedCost      # straight-line distance
        self.conectedNodes = []                 # labels of connected nodes

    def connect_node(self, label:str):
        if label in self.conectedNodes:
            print("Node already connected")
        else:
            self.conectedNodes.append(label)
            print("Node connected successfully")

    def disconnect_node(self, label:str):
        if label in self.conectedNodes:
            self.conectedNodes.remove(label)
            print("Node disconnected successfully")
        else:
            print("Node is not connected")
    
    def update_estimatedCost(self, estimatedCost:int):
        self.estimatedCost = estimatedCost
        print("Estimated cost updated successfully")
    
    def get_estimatedCost(self):
        return self.estimatedCost
    
    def get_connectedNodes(self):
        return self.conectedNodes

class Graph:
    """Manage attributes and methods related to whole graph"""
    def __init__(self, nodes:list):
        self.nodes = {}         # label: object
        self.create()

    def add_node(self, label:str, estimatedCost=0):
        newNode = Node(label, estimatedCost)
        self.nodes[label] = newNode
    
    def del_node(self, label:str):
        pass

class PriorityQ:
    def __init__(self):
        self.Q = []


    def add(self, label, estimatedCost):
        length = len(self.Q)
        element = (label, estimatedCost)
        
        if length == 0:
            self.Q.append(element)
            return
        
        if element in self.Q:
            return
        
        for idx in range(length):
            if estimatedCost < self.Q[idx][1]:
                self.Q.insert(idx, element)
                return

    def get(self):
        return self.Q.pop(0)


graph_connections = {
    'A':['B','C'],
    'B':['D','E','F'],
    'C':['E'],
    'D':[],
    'E':['F'],
    'F':['G'],
    'G':[]
}

graph_EC = {    # Straight-line distance
    'A':11,
    'B':9,
    'C':7,
    'D':4,
    'E':5,
    'F':1,
    'G':0
}

openlist = PriorityQ()
closelist = []
start='A'
goal='G'

def heuristic(label:str):
    return graph_EC[label]

def visit():
    if len(closelist) == 0:
        closelist.append(start)
        return
    closelist.append(openlist.get()[0])

def explore(label:str):
    connections = graph_connections[label]
    for node in connections:
        openlist.add(node, graph_EC[node])

def searchNxt(current):
    if goal in closelist:
        return
    explore(current)
    visit()
    searchNxt(closelist[-1])

def bestFS():
    if goal in closelist:
        return closelist
    
    visit()
    nxt = openlist.get()[0]
    explore(nxt)

# Create and Manage Graphs

class Node:
    def __init__(self, label, weight=0):
        self.label = label
        self.weight = weight
        self.connected = {}     # label: pathcost

class Graph:
    def __init__(self, copy:dict=None):
        if copy == None:
            self.graph = {}
        else:
            self.graph = copy

    def add_node(self, label, estimateCost):
        if label in self.nodes:
            print("Node already present")
        else:
            self.nodes[label] = Node(label, estimateCost)
# Find most optimal path using A* algorithm

class Node:
    def __init__(self, label, estDis=0):
        self.label = label
        self.estDis = estDis
        self.cnctNodes = {}         # label: actDis

    def cnctNode(self, label, actDis):
        if label in self.cnctNodes:
            print("Node already present")
        else:
            self.cnctNodes[label] = actDis

    def discnctNode(self, label):
        if label in self.cnctNodes:
            del self.cnctNodes[label]

    def showNode(self):
        print(f"Node:{self.label} => Estimated Distance:{self.estDis}; Connected Nodes:{self.cnctNodes})")

    def fndDis(self, label):
        if label in self.cnctNodes:
            return self.cnctNodes[label]
        print(f"{label} is not connected with {self.label}")

class Graph:
    def __init__(self):
        self.nodes = {}     # label : object

    def srchNode(self, label):
        return label in self.nodes

    def addNode(self, label, estDis):
        if self.srchNode(label):
            print("Node already present")
        else:
            self.nodes[label] = Node(label, estDis)

    def delNode(self, label):
        if self.srchNode(label):
            del self.nodes[label]
            # Remove label from connections in other nodes
            for node in self.nodes.values():
                node.discnctNode(label)

    def cnctNode(self, label1, label2, actDis, drcted=True):
        if self.srchNode(label1) and self.srchNode(label2):
            self.nodes[label1].cnctNode(label2, actDis)
            if not drcted:
                self.nodes[label2].cnctNode(label1, actDis)
        else:
            print("Nodes not present")

    def showGraph(self):
        for node in self.nodes.values():
            node.showNode()

class PriortyQ:
    def __init__(self):
        self.queue = []

    def add(self, label, fullDis):
        if self.isEmpty():
            self.queue.append((label, fullDis))
            return
        self.queue.append(label, fullDis)

    def pop(self):
        if self.isEmpty():
            print("No element in openlist")
            return

        smallest = self.queue[0]
        for node in self.queue:
            if node[1]<smallest[1]:
                smallest = node
        return smallest[0]
    
    def isEmpty(self):
        if len(self.queue) == 0:
            return True
        return False



## Generate graph
def genGraph():
    graph = Graph()
    for N in nodes:
        graph.addNode(N)
    for C in cnctions:
        graph.cnctNode(C[0], C[1], C[2], C[3])

    graph.showGraph()
    return graph

## select starting and ending point
def selectSG(graph):
    while True:
        start = input("Start node:")
        if graph.srchNode(start): break
        print(f"{start} is not a node!")

    while True:
        goal = input("Goal node:")
        if graph.srchNode(goal):
            graph.nodes[goal].estDis = 0
            break
        print(f"{start} is not a node!")

    for N in graph.nodes:
        if N == goal:
            continue
        while True:
            ED = int(input(f"Estimate distance from {N} to {goal}:"))
            if ED != 0:
                break
            print("Estimate distance from {N} to {goal} cannot be zero!")
        graph.nodes[N].estDis = ED

    return (start, goal)

## calculate the cost
def actCost(lst, graph):       # list of path travelled
    cost = 0
    for idx in range(len(lst)-1):
        frm_Node = graph.nodes[lst[idx]]
        to_label = lst[idx+1]
        cost += frm_Node.fndDis(to_label)
    return cost

def estCost(label, graph):
    return graph.nodes[label].estDis

def Fullcost(lst, graph):
    return actCost(lst, graph) + estCost(lst[-1], graph)

def explore(label, graph, openlst):
    neighbour = graph.nodes[label].cnctNodes
    for N in neighbour:
        openlst.add(N, neighbour[N])
    
def travel(label, graph):
    if openlst.isEmpty():
        closelst.append(label)
    else:
        closelst.append(openlst.pop())    
    



def Astar(start, goal):
    pass
    




## Graph details to generate the graph
nodes = ["A","B","C","D","E","F","G"]
cnctions = [("A", "B", 4, True),
        ("A", "C", 3, True),
        ("B", "E", 12, True),
        ("B", "F", 6, True),
        ("C", "D", 7, True),
        ("C", "E", 10, True),
        ("D", "E", 2, True),
        ("E", "G", 5, True),
        ("F", "G", 16, True)]       # (label1, label2, actDis, isDirect)
G = genGraph()

## Select start and end nodes
(start, goal) = selectSG(G)

## Creat openlist (priority queue)
openlst = PriortyQ()
closelst =[]
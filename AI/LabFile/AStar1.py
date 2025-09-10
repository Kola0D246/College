# Find most optimal path using A* algorithm

class Node:
    """Manage attributes and methods related to nodes"""
    def __init__(self, myLabel:str, estimateCost=0):
        self.myLabel = myLabel
        self.estimateCost = estimateCost
        self.conectedNodes = {}       # label: pathCost

    def connect_with_node(self, targetLabel:str, actualCost:int):
        self.conectedNodes[targetLabel] = actualCost

    def disconnect_node(self, targetLabel):
        if targetLabel in self.conectedNodes:
            del self.conectedNodes[targetLabel]
        else:
            print(f"Node {targetLabel} is not connected with {self.myLabel}")

    def find_distance_to(self, targetLabel):      # find actual cost between connected nodes (from self to label)
        if targetLabel in self.conectedNodes:
            return self.conectedNodes[targetLabel]
        else:
            print(f"{targetLabel} is not connected with {self.myLabel}")

    def show_node_info(self):
        connections = '; '.join(f"{keys}({values})" for keys, values in dict.items())
        print(f"Node:{self.myLabel} => Estimated Distance:{self.estimatedCost}; Connected Nodes:{connections}")

class Graph:
    def __init__(self, nodes:list, connections:list):
        self.nodes = {}     # label : object
        self.connect_nodes(nodes, connections)
        self.show_graph()

    def add_node(self, label, estimateCost):
        if label in self.nodes:
            print("Node already present")
        else:
            self.nodes[label] = Node(label, estimateCost)

    def del_node(self, label):
        if label in self.nodes:
            del self.nodes[label]
            # Remove label from connections in other nodes
            for node in self.nodes.values():
                node.disconect_node(label)

    def connect_nodes(self, from_label:str, to_label:str, actualCost, directed=True):
        if from_label in self.nodes and to_label in self.nodes:
            self.nodes[from_label].connect_with_node(to_label, actualCost)
            if not directed:
                self.nodes[to_label].connect_with_node(from_label, actualCost)
        else:
            print("Nodes are not present")

    def genrate_graph(self, node: list, conections: list):
        for N in self.nodes:
            self.addNode(N)
        for C in conections:
            self.conectNode(C[0], C[1], C[2], C[3])

    def show_graph(self):
        for node in self.nodes.values():
            node.showNode()

    def set_start_goal_nodes(self, startNode, goalNode):
        if startNode in self.nodes:
            while True:
                startNode = input("Start node label:")
                if startNode in self.nodes: break
                print(f"{start} is not a node in {self}!")

            while True:
                goalNode = input("Goal node label:")
                if goalNode in self.nodes: break
                print(f"{goalNode} is not a node in {self}!")
        

        for thisNode in self.nodes:
            if thisNode == goalNode:
                self.nodes[goalNode].estimateCost=0
                continue

            while True:
                estimateCost = int(input(f"Estimate cost from {thisNode} to {goalNode}:"))
                if estimateCost != 0:
                    break
                else:
                    print(f"Estimate distance from {thisNode} to {goalNode} cannot be zero!")
            self.nodes[thisNode].estimateCost = estimateCost

class PriortyQ:
    def __init__(self):
        self.queue = []

    def add(self, label, fullDis):
        self.queue.append((label, fullDis))

    def pops(self):
        if self.isEmpty():
            print("No element present")
            return

        smallest = self.queue[0]
        for node in self.queue:
            if node[1]<smallest[1]:
                smallest = node
        self.remove(smallest)
        return smallest[0]
    
    def isEmpty(self):
        if self.queue == {}:
            return True
        else:
            return False

## Generate graph


## select starting and ending point
def selectSG(graph):
    

    return (start, goal)

## calculate the cost
def actCost(lst, graph):    # list of path travelled
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

# exploring neighbouring nodes
def explore(label, graph, openlst):
    neighbours = graph.nodes[label].cnctNodes
    for N in neighbours:
        openlst.add(N, neighbours[N])
    
def travel(label, graph):
    if openlst.isEmpty():
        closelst.append(label)
    else:
        closelst.append(openlst.pops())

def Astar(start_label, goal_label, graph):
    if start_label == goal_label:
        return closelst
    current_node_label = start_label
    explore(current_node_label, graph)
    travel(current_node_label, graph)
    Astar(closelst[-1], goal_label, graph)


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


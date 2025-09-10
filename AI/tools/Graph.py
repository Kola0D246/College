# This is prgram to generate and manage graph

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
            pass
        

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
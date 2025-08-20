#Storing graph in a dictionary

class Graph:
    '''Dictionary datatype is use to store graph representation when an object is created
    <graph object> = {<vertex>: <list of vertices connected to this vertex by edges>} 
    '''

    def __init__(self):
        self.graph = {}
        print("Empty graph is created")
    
    #Insert
    def addvertex(self, vertex):
        self.graph[vertex] = []
        print(f"Vertex {vertex} added successfully")

    def addedge(self, vertex1, vertex2, typ = "undirected"):
        if vertex1 in self.graph and vertex2 in self.graph:
            if vertex2 not in self.graph[vertex1]:
                self.graph[vertex1].append(vertex2)
            if vertex1 not in self.graph[vertex2] and typ == "undirected":
                self.graph[vertex2].append(vertex1)
            print(f"Edge added between {vertex1} and {vertex2}")
        else:
            print(f"Vertecies - {vertex1}, {vertex2} or both - are not found in graph")


    #Search
    def listvertex(self):
        return list(self.graph.keys())   #return list of all vertices
    
    def listedges(self, vertex):
        if vertex in self.graph:
            return self.graph[vertex]    #return list of all edges connected to given vertex
        else:
            print(f"Vertex {vertex} not found in graph")
    
    def searchvertex(self, vertex):     #check if vertex exist in graph
        if vertex in self.graph: return True
        else: return False
        
    def searchedge(self, vertex1, vertex2):   #check if edge exist in between given pair of vertices
        if vertex1 in self.graph:
            if vertex2 in self.graph[vertex1]: return True
            else: return False
            
    #Traverse
    def traverse(self, vertex):
        if vertex in self.graph:
            visited = [vertex]
            stack = [vertex]
            pass #learn this
    
    #deletion
    def removevertex(self, vertex):
        if vertex in self.graph:
            self.graph.pop(vertex)        #This will remove the vertex from the graph
            for i in self.graph:          #This will remove the vertex from list of edges in other vertecies 
                if vertex in self.graph[i]:
                    self.graph[i].remove(vertex)
            print(f"Vertex {vertex} removed successfully")

    def removeedge(self, vertex1, vertex2):
        if vertex1 in self.graph and vertex2 in self.graph:   
            if vertex2 in self.graph[vertex1]:            #remove directed edge/ first accurance of directed edge
                self.graph[vertex1].remove(vertex2)
            if vertex1 in self.graph[vertex2]:            #remove second accurance of undirected edge
                self.graph[vertex2].remove(vertex1)
            print(f"Edge removed between {vertex1} and {vertex2}") 
        else:
            print(f"Vertecies - {vertex1}, {vertex2} or both - are not found in graph")

    #other functions
    def edgetype(self, vertex1, vertex2):
        A = B = False
        if vertex1 in self.graph:
            if vertex2 in self.graph[vertex1]:
                A = True
        if vertex2 in self.graph:
            if vertex1 in self.graph:
                B = True
        if A and B:
            return "undirected"
        else:
            return "directed"

    #display graph
    def adjlist(self):
        for i in self.graph:
            print(f"{i} -> {self.graph[i]}")

    def adjmatrix(self):
        pass

    def displaygraph(self):
        pass
        #use matplotlib to display picture of graph

############################################################################################################################

vertices = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"]
Edges = [("A", "B"), ("A", "C"), ("B", "D"), ("B", "E"), ("C", "F"), ("C", "G"), ("D", "H"), ("D", "I"), ("E", "J")]

graph1 = Graph()       #creaye empty graph
'''
for x in vertices:
    graph1.addvertex(x)    #add all vertices
for x in Edges:
    graph1.addedge(x[0], x[1], type="directed")    #add all edges as directed edges
graph1.adjlist()
for x in Edges:
    graph1.removeedge(x[0], x[1])  #remove edge

for x in Edges:
    graph1.addedge(x[0], x[1])  #add all edges as undirected edges
graph1.adjlist()
'''
print(type(graph1))

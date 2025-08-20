class Graph:
    def __init__(self):
        self.graph = {}     #create graph

    def add_vertex(self, vertex):
        if vertex not in self.graph:
            self.graph[vertex] = []

    def add_edge(self, u, v):
        self.add_vertex(u)
        self.add_vertex(v)
        self.graph[u].append(v)

    def display(self):
        print("Graph adjacency list:")
        for vertex in self.graph:
            print(f"{vertex} -> {self.graph[vertex]}")

# Example usage
if __name__ == "__main__":
    # Create an undirected graph
    g = Graph()

    # Add edges
    g.add_edge("A", "B")
    g.add_edge("A", "C")
    g.add_edge("B", "D")
    g.add_edge("C", "D")

    # Display graph
    g.display()

def add_vertex(graph, vertex):
    if vertex not in graph:
        graph[vertex] = []

def add_edge(graph, u, v, directed=False):
    add_vertex(graph, u)
    add_vertex(graph, v)
    graph[u].append(v)
    if not directed:
        graph[v].append(u)

def display_graph(graph):
    print("Graph adjacency list:")
    for vertex in graph:
        print(f"{vertex} -> {graph[vertex]}")

# Example usage
graph = {}

add_edge(graph, 'A', 'B')
add_edge(graph, 'A', 'C')
add_edge(graph, 'B', 'D')
add_edge(graph, 'C', 'D')

display_graph(graph)

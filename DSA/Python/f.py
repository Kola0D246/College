graph = []
adj = []
#graph = [[1,2], [1, 3], [2,4], [2,5]]

graph = eval(input("Enter graph(in form of nested list): "))
vertices = 0
edges = len(graph)
for i in graph:
    if i[0] > vertices: vertices = i[0]
    elif i[1] > vertices: vertices = i[1]
    else: print("l")
for i in range(vertices): adj.append([0]*5)

#print(adj)
for k in graph:
    adj[k[0]-1][k[1]-1] = 1
    adj[k[1]-1][k[0]-1] = 1
print(adj)
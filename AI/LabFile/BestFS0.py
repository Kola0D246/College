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

start = 'A'
goal = 'G'

openlist = []
closelist = []

def add_OL(label, estimatedCost):
    length = len(openlist)
    element = (label, estimatedCost)
    
    if length == 0:
        openlist.append(element)
        return
    
    if element in openlist:
        return
    
    for idx in range(length):
        if estimatedCost < openlist[idx][1]:
            openlist.insert(idx, element)
            return
        
    openlist.append(element)

def heuristic(label:str):
    return graph_EC[label]

def visit(label):
    closelist.append(label)

def explore(label):
    connections = graph_connections[label]
    for node in connections:
        add_OL(node, graph_EC[node])

def BFS(start, goal):
    visit(start)
    if start == goal:
        return
    
    explore(start)
    nxt = openlist[0]
    BFS(nxt[0], goal)

BFS('A', 'G')
print(closelist)
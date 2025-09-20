#### DATA ####

graph_connections = {
    'A':{'B':4, 'C':2},
    'B':{'D':3, 'E':5, 'F':2},
    'C':{'E':1},
    'D':{},
    'E':{'F':6},
    'F':{'G':1},
    'G':{}
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

openlist = []
closelist = []

#### FUNCTIONS 0 ####

def pathcost(lst, nxt):
    lst.append(nxt)
    pathcost = 0
    for idx in range(1, len(lst)):
        connection = graph_connections[lst[idx-1]]
        print(connection)
        print(lst)
        pathcost += connection[lst[idx]]
    return pathcost
    
def fullCost(label:str):
    return graph_EC[label] + pathcost(closelist, label)

def add_OL(label, fullCost):
    length = len(openlist)
    element = (label, fullCost)
    
    if length == 0:
        openlist.append(element)
        return
    
    if element in openlist:
        return
    
    for idx in range(length):
        if fullCost < openlist[idx][1]:
            openlist.insert(idx, element)
            return
        
    openlist.append(element)

def visit(label):
    closelist.append(label)

def explore(label):
    connections = graph_connections[label]
    for node in connections.keys():
        add_OL(node, fullCost(node))

def AStar(current, goal):
    visit(current)
    if goal in closelist:
        return
    
    explore(current)
    nxt = openlist[0]
    AStar(nxt[0], goal)

AStar('A', 'G')
print(openlist)
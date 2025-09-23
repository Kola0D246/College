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

def pathcost(lst):
    pathcost = 0
    for idx in range(1, len(lst)):
        connection = graph_connections[lst[idx-1]]
        pathcost += connection[lst[idx]]
    return pathcost

def add(lst, path, fullCost):
    element = (path, fullCost)
    if element in lst:
        return
    
    i = 0
    while i < len(lst):
        if fullCost < lst[i][1]:
            lst.insert(i, element)
            return
        i += 1
    lst.append(element)

def AStar(start, goal, openlist=None):
    if openlist is None:
        openlist = []
        add(openlist, [start], graph_EC[start])
    
    if not openlist:
        print("No path found")
        return None
    
    path, est_cost = openlist.pop(0)  # pick the path with lowest estimated cost
    current = path[-1]
    
    if current == goal:
        print("Path found:", path)
        print("Path cost:", pathcost(path))
        return path
    
    for neighbor, step_cost in graph_connections[current].items():
        if neighbor not in path:  # avoid cycles
            g_cost = pathcost(path) + step_cost
            h_cost = graph_EC[neighbor]
            total_cost = g_cost + h_cost
            add(openlist, path + [neighbor], total_cost)
    
    return AStar(start, goal, openlist)

AStar('A', 'G')
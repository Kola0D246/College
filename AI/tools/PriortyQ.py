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
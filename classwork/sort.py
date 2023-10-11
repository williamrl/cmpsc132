from operator import gt, lt

class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
        
    def __repr__(self):
        return f'Node({self.data}, {repr(self.next)})'
    
class LinkedList:
    def __init__(self, head=None):
        self.head = head
        
    def __repr__(self):
        return f'LinkedList({repr(self.head)})'
    

def swap(first, second):
    """->second->first->rest"""
    first.data, second.data = second.data, first.data

values = Node(4, Node(3, Node(2, Node(1))))
LL = LinkedList(values)
# print(LL)
# swap(LL.head, LL.head.next)
# print(LL)

def bubble_sort(LL, op = gt):
    for i in range(4):#normally would run off the size element from the linked list when length is unknown
        current = LL.head
        nextNode = current.next
        while current.next:
            if op(current.data, nextNode.data):
                swap(current, nextNode)
            else:
                current = nextNode
            nextNode = current.next
    return LL

LL = bubble_sort(LL)

print(LL)

values = Node(3, Node(1, Node(-1, Node(1))))
otherLL = LinkedList(values)
otherLL = bubble_sort(otherLL)
print(otherLL, lt)
def countdown(n):
    if n <= 0:
        print("BLASTOFF!")
    else:
        print(n)
        countdown(n - 1)

countdown(10)

def countrdown_sum(n):
    if n<= 0:               #recursion needs a base case
        print("BLASTOFF!")
        return n
    else:
        print(n)
        return n + countrdown_sum(n - 1)

value = 11
print( (value)*(value+1)//2)
summands = countrdown_sum(value)
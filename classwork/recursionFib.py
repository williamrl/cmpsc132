from functools import lru_cache

known = {}
known[0] = 1
known[1] = 1

@lru_cache(maxsize = None)
def fib(n):
    # if n == 0 or n == 1:
    #     return 1
    # else:
    #     return fib(n-1) + fib(n-2)
    if n in known:
        return known[n]
    else:
        known[n] = fib(n-1) + fib(n-2)
        return known[n]
    


print(fib(150))

#how many different ways can you make change for 2 dollars using american money
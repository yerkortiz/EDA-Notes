import random 

def randomInt(min, max):
    return random.randint(min, max)

def shuffle(list):
    if len(list) < 2:
        return
    for curr_idx, curr_val in enumerate(list):
        swap_idx = randomInt(curr_idx, len(list) - 1)
        swap_val = list[swap_idx]

        if swap_idx != curr_idx:
            list[curr_idx], list[swap_idx] = swap_val, curr_val
        
def testcase1(n):
    l = []
    for i in range(n):
        l.append(i)
    shuffle(l)
    print(n)
    for i in range(n):
        print(l[i] + 1, end = " ")
    return l

n = int(input())
l = testcase1(n)

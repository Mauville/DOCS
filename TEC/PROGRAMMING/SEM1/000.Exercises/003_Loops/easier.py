size = int(input("Input triangle size: \n"))
size += 1
step  = 1
spaces = size

while step < size:
    print (" " * spaces + "* " * step)
    spaces -= 1
    step += 1


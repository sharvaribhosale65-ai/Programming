class Demo:
    def __init__(self):                 #self is this pointer 
        print("Inside constructor")

    def __del__(self):
        print("Inside destructor")

obj1 = Demo()
obj2 = Demo()

print("End of application...")
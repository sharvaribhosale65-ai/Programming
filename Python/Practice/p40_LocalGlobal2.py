no = 11          #Global variable

def Display():
    a = 21      #local variable
    print("From Display : ",no)
    print("From Display value of a : ",a)

def Demo():
    print("From Demo value of a is : ",a)       #error
    print("From Demo : ",no)


Display()
Demo()
def Area(radius, pi):
    Ans = pi * radius * radius
    return Ans

def main():
    ret = Area(pi = 3.14, radius = 10.5)        #keyword
    print("Area of circle is : ",ret)


if __name__ == '__main__':
    main()
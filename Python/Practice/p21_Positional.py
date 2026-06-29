def Area(radius, pi):
    Ans = pi * radius * radius
    return Ans

def main():
    ret = Area(10.5, 3.14)      #positional
    print("Area of circle is : ",ret)

    ret = Area(13.6, 7.12)
    print("Area of circle is : ",ret)

if __name__ == '__main__':
    main()
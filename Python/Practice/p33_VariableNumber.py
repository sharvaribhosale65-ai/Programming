def Display(*Data):         #* is variable number of argu,emt
    print(Data)
    print(type(Data))

def main():
    Display(10, 45.89, False, "python", 20, 30, 40, 50, 50, 60)
    
    
if __name__ == '__main__':
    main()
#inner(nested) function

def BigBazar():
    print("Inside BigBazar")


    def Amul():
        print("Inside Amul Ice-cream parlour")

    Amul()
    Amul()

def main():
    BigBazar()          

if __name__ == '__main__':
    main()
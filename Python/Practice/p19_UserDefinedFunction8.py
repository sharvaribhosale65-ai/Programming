def BigBazar():
    print("Inside BigBazar")

    def Amul():
        print("Inside Amul Ice-cream parlour")

def main():
    BigBazar()          #allowed
    Amul()              #error
    BigBazar.Amul()     #error

if __name__ == '__main__':
    main()
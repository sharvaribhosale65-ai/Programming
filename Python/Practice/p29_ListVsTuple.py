#-----------------------------------------------------------
#                   List                Tuple
#-----------------------------------------------------------
#Ordered            Yes                  Yes
#Indexed            Yes                  Yes
#Mutable            Yes                   No
#
#---------------------------------------------------------

def main():
    
    data1 = [10, 20, 30, 40]        #list
    data2 = (10, 20, 30, 40)        #tuple

    print(data1)
    print(data2)

    print(data1[0])
    print(data2[0])

if __name__ == '__main__':
    main()
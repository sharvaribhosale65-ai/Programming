#-----------------------------------------------------------
#                   List                    Tuple
#-----------------------------------------------------------
#Ordered            Yes                     Yes
#Indexed            Yes                     Yes
#Mutable            Yes                     No
#Hetrogeneous       Yes                     Yes
#---------------------------------------------------------

def main():
    
    data1 = [10, 3.14, True, "Pune"]        #list - hetrogeneous
    data2 = (10, 3.14, True, "Pune")        #tuple - hetrogeneous

    print(data1)
    print(data2)

    print(data1[0])
    print(data2[0])

if __name__ == '__main__':
    main()
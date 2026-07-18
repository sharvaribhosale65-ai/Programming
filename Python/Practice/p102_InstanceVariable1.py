class Marvellous:
    No1 = 11                #class variable
    No2 = 12                #class variable               

    def __init__(self):
        self.Value1 = 21        #instance variable
        self.Value2 = 51        #instance variable

print(Marvellous.No1)
print(Marvellous.No2)

#object / instance creation
mobj1 = Marvellous()            
mobj2 = Marvellous()
mobj3 = Marvellous()

print(mobj1.Value1)
print(mobj2.Value1)

"""
Output :
11
12
21
21
"""
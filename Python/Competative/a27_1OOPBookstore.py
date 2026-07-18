"""
Algorithm   :
        START
            Create a class BookStore.
            Accept book name and author name.
            Increment the total number of books.
            Display the book details and total number of books.
        STOP
"""

"""
Function name   :   __init__
Input           :   string, string
Output          :   None
Description     :   Initialize the book name, author name and increment the book count.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class BookStore:

    NoOfBooks = 0

    def __init__(self, name, author):

        self.BookName = name
        self.AuthorName = author

        BookStore.NoOfBooks = BookStore.NoOfBooks + 1

    """
    Function name   :   Display
    Input           :   None
    Output          :   None
    Description     :   Display the book name, author name and total number of books.
    """
    
    def Display(self):

        print(self.BookName, "by", self.AuthorName)
        print("No. of books : ", BookStore.NoOfBooks)
        print()

"""
Application to maintain the details of books and count the total number of books.
"""

bObj1 = BookStore("Linux System Programming", "Robert Love")
bObj1.Display()

bObj2 = BookStore("C Programming", "Dennis Ritchie")
bObj2.Display()

"""
Output  :

            Linux System Programming by Robert Love
            No. of books : 1

            C Programming by Dennis Ritchie
            No. of books : 2
"""
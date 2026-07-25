import schedule
import datetime
import time

def CreateNewFile():

    timestamp = time.ctime()

    Txtfile = "File%s.txt"%(timestamp)
    Txtfile = Txtfile.replace(" ","_")
    Txtfile = Txtfile.replace(":","_")

    print("Text file gets created with name : ",Txtfile)

    fObj = open(Txtfile,"w")

    fObj.write("File name : \n")
    fObj.write(Txtfile)

    fObj.write("Current date and time : \n")
    fObj.write(str(datetime.datetime.now()))


def main():

    schedule.every(1).minute.do(CreateNewFile)

    while True:
        schedule.run_pending()
        time.sleep(1)


if __name__ == "__main__":
    main()
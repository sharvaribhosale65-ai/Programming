import schedule
import time
import datetime

def Display():

    fObj = open("MarvellousX.txt","a")
    fObj.write("Task executed at : ")
    fObj.write(str(datetime.datetime.now()))
    fObj.write("\n")
    fObj.close

    print("Task executed sucessfully...")

def main():

    schedule.every(5).minutes.do(Display)

    while(True):
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()
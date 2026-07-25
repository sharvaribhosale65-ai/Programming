import time
import datetime
import schedule

def Display():

    timestamp = time.ctime()

    LogfileName = "Demo%s.log"%(timestamp)
    LogfileName = LogfileName.replace(" ","_")
    LogfileName = LogfileName.replace(":","_")

    print("Logfile gets created with name : ",LogfileName)

    fObj = open(LogfileName,"w")

    fObj.write("Logfile gets created successfully....\n")
    fObj.write("Current time is : ")
    fObj.write(str(datetime.datetime.now()))
    fObj.write("\n\n")

    fObj.close()

def main():

    schedule.every(10).minutes.do(Display)

    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()
import schedule         #third party module
import time
import datetime

def Display():          #call back function
    print("Jay ganesh...",datetime.datetime.now())


def main():
    print("Automation script started")

    schedule.every(1).minute.do(Display)

    while True:
        schedule.run_pending()
        time.sleep(1)                   #1sec
    
    print("End of automation script")

if __name__ == "__main__":
    main()
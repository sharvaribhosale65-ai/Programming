import schedule         #third party module
import time
import datetime

def Display():          #call back function
    print("Jay ganesh...",datetime.datetime.now())


def main():
    print("Automation script started")

    schedule.every(1).minute.do(Display)            #issue

if __name__ == "__main__":
    main()
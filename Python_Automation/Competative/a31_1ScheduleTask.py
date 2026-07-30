import schedule
import time

def Display(fMsg):
    
    print(fMsg)


def main():

    msg = input("Enter message : ")
    interval = int(input("Enter interval in seconds : "))

    if interval <= 0:
        print("Interval must be greater than 0")
        return

    schedule.every(interval).seconds.do(Display, msg)

    while(True):
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()
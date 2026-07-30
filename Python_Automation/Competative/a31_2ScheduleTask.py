import schedule
import time

def Display(fmsg):

    print(fmsg)

def main():

    msg = input("Enter message : ")

    schedule.every(5).seconds.do(Display, msg)
    while(True):
        schedule.run_pending()
        time.sleep(1)


if __name__ == "__main__":
    main()
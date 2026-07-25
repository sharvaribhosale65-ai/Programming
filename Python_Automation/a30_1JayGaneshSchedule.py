import schedule
import time

def PrintJayGanesh():

    print("Jay Ganesh...")

def main():

    schedule.every(2).seconds.do(PrintJayGanesh)
    while(True):
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()
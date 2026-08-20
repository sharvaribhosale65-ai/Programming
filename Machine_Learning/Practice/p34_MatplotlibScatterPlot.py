import pandas as pd
import matplotlib.pyplot as plt

def main():

   study_hours = [1, 2, 3, 4, 5, 6]
   marks = [35, 42, 50, 62, 72, 85]

   plt.scatter(
       study_hours,         #x axis
       marks,                   #y axis
       s = 100,         #
       marker="o",  
       alpha=0.8,
       edgecolors="black",
       linewidths=1,
       label = "Students"
   )                                                #we use scatter for clustering

   plt.title("Scatter plot")
   plt.xlabel("Study hours")
   plt.ylabel("Obtained marks")
   plt.grid(True)
   plt.legend()
   plt.show()
   
if __name__ == "__main__":
    main()
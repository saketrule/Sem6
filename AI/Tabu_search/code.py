## Contains code for Tabu search

## Step 1 is to generate data
from numpy import *
from math import *
import matplotlib.pyplot as plt

## Randomly generates N datapoints along given theta with noise-width nw
## Returns a numpy array with elements as tuples of (x,y) coordinates
## radius of circle r
def RandGen(theta,N,nw,r):
    tx = random.uniform(-r,r,N)
    ty = random.normal(0,nw,N)
    x = tx*cos(theta) - ty*sin(theta)
    y = ty*cos(theta) + tx*sin(theta)
    return zip(x,y)


## Function to plot the points
def plotpoints(points):
    plt.plot([point[0] for point in points],[point[1] for point in points],'ro')
    plt.axis([-1000,1000,-1000,1000])
    plt.show()

line1 = RandGen(pi/4,1000,10,1000)
line2 = RandGen(pi/2,50,5,1000)
line3 =RandGen(pi/6,100,10,1000)
data = line1 + line2 + line3
plotpoints(data)

## heuristic function
def hs(theta, data):
    return sum([x*sin(theta)-y*cos(theta) for x,y in data])




'''
This is a proogram to calculate and plot graph of filling a hemispherical comtainer with water
'''

import matplotlib as mpt
PI = 3.141

def vol_hemisphere(radius, height):
    return 2*PI*radius*radius*height/3



def graph(radius, height, stream):
    for measure in range(0, height, height/100):
        volume = vol_hemisphere(radius, height)



mpt.plot()

print(hemisphere(20, 30))

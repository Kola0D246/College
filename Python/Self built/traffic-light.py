""" Input the colour of Traffic light and get the appropriate action in output
    STOP!               for red
    slow and careful    for yellow
    Go!                 for green
    Wrong colour        for any other value
"""
print("Are you confuse about what to do with different colours on traffic light? May be we could help :)")

colour = input("What is the colour of traffic light?:")

if colour == 'red':
    print("STOP!")
elif colour == 'yellow':
    print("slow and careful")
elif colour == 'green':
    print("Go!")
else: 
    print("Wrong colour")

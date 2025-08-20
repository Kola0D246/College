#This is a python program to interchange units of time

dict= {
#   'unit': multiple of second,
    'second': 1,
    'minute': 60,
    'hour': 3600,
    'day': 86400,
    'week': 604800
}

def Dscale(value, unit):
    for i in dict:
        if unit==i: 
            value2 = value*dict[i]
            break
    return value2

def Uscale(value, unit):
    for i in dict:
        if unit==i:
            value2= value/dict[i]
            break
    return value2

def timeconv_frac(value1, unit1, unit2):
    get1 = Dscale(value1, unit1)
    get2 = Uscale(get1, unit2)
    return get2

def timeconv_long(value1, unit1, unit2):            #incomplete function
    value2 = timeconv_frac(value1, unit1, unit2)
    for unit in dict.keys():
        if unit == unit2:
            break
    call = int(value2)
    place = dict[unit2]
    stg= str(call)+' '+unit2
    print(stg)



m= timeconv_long(110, 'second', 'minute')
print(m)
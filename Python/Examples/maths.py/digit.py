def digit_frm_dot(num, place):
    """Tells the digit at any postition from the decimal point"""
    num=str(num)
    try: zero=num.index('.')
    except: zero=0
    return(int(num[zero-x]))

def digitcount(num):
    '''Count number of digit in integer or float'''
    if type(num)==float:
        return(len(str(num))-1)
    else:return(len(str(num)))

def count(frm, to, by=1):
    if frm<to:
        if by<0: raise ValueError("if 'frm'<'to' then 'by' must greater than 0")
        lst = [num for num in range(frm, to, by)]
    elif frm>to:
        if by>0: raise ValueError("if 'frm'>'to' then 'by' must smaller than 0")
        lst = [num for num in range(frm, to, by)]
    
    if to%by==0: lst.append(to)
    
    return(lst)

print(lstdigits(1457.34))
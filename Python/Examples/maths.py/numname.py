"""
This program is to write any number from digits to words and words to digits.
"""

### terms ################################################################################################################
Fvalue1= ('zero','one','two','three','four','five','six','seven','eight','nine',)
Pvalue1 = ('teen', 'ty', 'hundred')
Pvalue_Ind = ('', 'thousand', 'lakh', 'carore')
Pvalue_Int = ('thousand', 'million', 'billion', 'trillion', 'quadrillion')

### words to digits ######################################################################################################
def common_elements(lst1, lst2):
    output = [x for x in lst2 if x in lst1]
    return output

def word_to_num(num):
    '''Write number from word to digits'''
    output=''
    words = num.split(" ")
    for FV in words:
        if FV in Fvalue1: 
            output += str(Fvalue1.index(FV))
    return output

word_to_num('one hundred two two')

### digits to words ######################################################################################################
def lstdigits(num):
    '''List the all the digits present in the number in their order from left to right (10 for the place of decimal)'''
    lst=[int(dig) if dig!= '.' else 10 for dig in str(num)]
    return lst

def Fvalues(num):
    '''Write face value for each digit in a number'''
    lst01= lstdigits(num)
    lst02= [Fvalue[x] for x in lst01]
    lst03= 0
    print(lst02)
    #incomplete

def int_to_word(num):
    '''Write number from digits to words'''
    pass

def dec_to_word(num):
    '''Write float number from digits to words'''
    pass

for d in len(str(num)):
    if d == '-':sign = 'minus'
    elif d == '.': point = d.index()
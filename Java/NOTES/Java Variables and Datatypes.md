# Variable and Datatype in JAVA

Variable => A named memory location that stores some value.
            During compilation, the name of variable in program is replaced with the value that variable holds

Datatype => Tells what type of data variable holds and how much memory it takes

1. Primitive -> Single values Stored Directly in Memory
                Store in Stack
2. Reference -> Sequece of Primitive values.
                Store memory reference in Stack, pointing to actual value stored in heap

Primitive | Reference
----------|----------
int | string
float | array
char | object
bool | -

Steps to create a variable

1. Declaration -> assign a label (variable name) to a block of memory. The size of this block is determine by the datatype of variable. Basically, we are creating a variable.

    `<datatype> <var_name>`

2. Assignment or Initialization -> Once declared, we can store some value accroding to the datatype of variable.

    `<var_name> = <value>`      = is assignment operator

If a new value is assigned to a variable, it will overwrite the previous value.

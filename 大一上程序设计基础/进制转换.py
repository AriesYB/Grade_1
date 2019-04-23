# -*- coding: cp936 -*-
x=int(input("请输入需要转换的数"))
s="."
a=x%8
b=(x-a)/8
while b==0:
    a=b%8
    b=(x-a)/8
    s=str(a)+s
print(s)

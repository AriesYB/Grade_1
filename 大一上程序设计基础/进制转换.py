# -*- coding: cp936 -*-
x=int(input("��������Ҫת������"))
s="."
a=x%8
b=(x-a)/8
while b==0:
    a=b%8
    b=(x-a)/8
    s=str(a)+s
print(s)

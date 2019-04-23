
#打印星号
m=[1,3,5]
n=[3,4,5]
for i in [1,2,3]:
    print(" "*(n[i-1]-m[i-1]),end="")
    print("*"*(m[i-1]))
    print()

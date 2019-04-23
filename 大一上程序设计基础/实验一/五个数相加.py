x=1
sum=0
b=int(input("请输入这些数的个数："))
if (b>10):
    print("错误，请重新输入！")
else:
    while(x<=b):
        x+=1
        a=int(input("请输入一个整数："))
        sum+=a
    print("和是",sum)

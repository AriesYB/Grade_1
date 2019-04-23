# -*- coding: cp936 -*-
#输入某年某月某日，判断这一天是这一年的第几天？
x=0
while x==0:#让这个程序运行完成后能一直显示结果 并进行下一次计算
    a=int(input("请输入年:"))
    b=int(input("月份:"))
    c=int(input("日:"))
    if(not 1<=b<=12 or not 1<=c<=31):
        print("请输入正确数值！")
    else:
        print("这是第%年",a)
        if(a%4==0):
            m=29
        else:
            m=28
            if(b==1):
                print(c)
            elif(2<=b<=3):
                print(m*(b-2)+c)
            elif(4<=b<=5):
                print(31+m+31+(b-4)*30+c)
            elif(6<=b<=7):
                print(31+m+31+30+31+(b-6)*30+c)
            elif(8<=b<=9):
                print(31+m+31+30+31+30+31+(b-8)*31+c)
            elif(10<=b<=11):
                print(31+m+31+30+31+30+31+31+30+(b-10)*31+c)
            elif(b==12):
                print(31+m+31+30+31+30+31+31+30+31+30+c)

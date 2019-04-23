# -*- coding: cp936 -*-
#输入某年某月某日，判断这一天是这一年的第几天？
while(1):#让这个程序运行完成后能一直显示结果 并进行下一次计算
    a=int(input("请输入年"))
    b=int(input("月"))
    c=int(input("日"))
    if(a%4==0):
        m=29
    else:
        m=28
    days=[31,m,31,30,31,30,31,31,30,31,30,31]
    if(not 1<=b<=12 or not 1<=c<=31):
        print("请输入正确数值！")
    else:
        print("这是第",a,"年")
        print(sum(days[0:b-1])+c,"天")#从1月的天数一直加到输入的月份的天数

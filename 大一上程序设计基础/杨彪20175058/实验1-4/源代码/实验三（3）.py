m,k=0,0
while(1):
    n=3#更新次数
    import random
    b=random.randint(1,10)#取随机数
    k=k+1#取了k次随机数
    while(n>0):
        a=int(input("请输入你想猜的数："))
        n=n-1#猜了一次，减少次数
        if (a!=b):
            print("很遗憾，你猜错了！还有",n,"次机会")
        if (b==a):
            print("恭喜你，猜对了！")
            n=0
            m=m+1
        if (n==0):
            print("")
            print("请选择序号：")
            c=int(input("1.继续游戏  2.结束游戏"))
            if (c==1):
                #猜对的次数
                continue#重新游戏
            elif (c==2):
                print("游戏结束！")
                print("猜对了",m,"次","产生了",k,"次随机数")
                break
    if (c==2):
        break

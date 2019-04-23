while(1):
    n=int(input("请输入现在是第几个月?"))
    list=[1,1]
    while (len(list)<n):
        list.append(sum(list[-2:]))
    print("现在一共有：",list[-1],"对兔子")

x=input("请输入一组正数并使他们用英文逗号隔开")
a=x.split(",")
b,c=[],[]
for i in range(0,len(a)):
    b.append(int(a[i]))         #把列表中的字符类型转换成整型
def avrage(x):                  #自定义一个平均值函数
    s=0
    for i in range(0,len(x)):
        s=s+int(x[i])
    print(s/(len(b)))
def condition(x):               #自定义条件函数
    b.sort()
    for i in range(0,len(x)):
        if (b[i]>=(sum(b)/(len(b)))):
            c.append(b[i])
    print(len(c))
def Print(x):
    print("平均值是：")
    avrage(x)
    print("大于等于平均值的数量是：")
    condition(x)
Print(b)

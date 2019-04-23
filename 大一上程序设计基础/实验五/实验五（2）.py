a=[]
n=int(input("请输入数组的元素个数（不小于2）："))#该题是15个
import random           #引入随机数模块
for i in range(1,n+1):
    a.append(random.randint(-20,20))   #赋初值建一个含有n个数的数组
a.sort()                        #从小到大排序
b=int(input("请输入你要查找的值"))
while (n!=2):
    if (isinstance(n/2,int)):
        pass
    else:
        n+=1
    i=n/2                     #一共有偶数项
    if (a[i]<b):             #b在右区间
        n=n/2+1
    else:
        n=n/2

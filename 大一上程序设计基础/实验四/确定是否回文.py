a=str(input("请输入一个字串符"))
a.lower()#将字符全部小写
list1,list2=[],[]#创建两个空列表
for i in range(1,len(a)):
    list1.append(a[i-1])#创建顺读字符组成的列表
    list2.append(a[-i])#创建倒读字符组成的列表
if (list1==list2):
    print("该字串符为回文")
else:
    print("该字串符不是回文")

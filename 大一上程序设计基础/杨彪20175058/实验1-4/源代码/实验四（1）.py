list1=[]
list2=[]
list3=[]
for i in range(1,31):
    print("请输入第",i,"个",end="")
    a=int(input("学生成绩："))
    list1.append(a)
    if (a>60):
        list2.append(a)
        if (a>90):
            list3.append(a)
print("60分以上的有",len(list2),"个")
print("90分以上的有",len(list3),"个")

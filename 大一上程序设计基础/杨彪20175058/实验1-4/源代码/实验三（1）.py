while(1):
    a=int(input("请输入班级数量"))
    print("一共有",a,"班")
    class_list=[0]
    for i in range(1,a+1):
        class_list.append(i)
        class_list[i]=[]
        print("这是",i,"班")
        b=int(input("请输入学生数量"))
        if (b>=50):
            print("输入错误，请重新输入！")
            break
        for n in range(1,b+1):
            print("这是第",n,"个学生")
            class_list[i].append(input("成绩"))
    for x in range(1,a+1):
        print(x,"班:",class_list[x])

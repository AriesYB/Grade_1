from tkinter import*
root=Tk()
root.title('矩阵')

#frame分区
frame1=Frame(root,width=200,height=200,bg='black')
frame1.grid(row=0)
frame2=Frame(root,width=200,height=100,bg='white')
frame2.grid(row=1)

#输入框
entry=Entry(frame2,width=4,bg='light blue')
entry.grid(row=0,column=1)


#计算代码
def jisuan(event):
    while(1):
        n=int(input("请输入n的值以创建n阶方阵:"))
        A=int(input("1.初始化得到数值    2.输入数值"))
        a,b,c=[],[],[]#创建0列表
        for i in range(1,n+1):#相当于第i行
            a.append([])#创建i个行
            b.append([])
            c.append([])
        for j in range(1,n+1):#相当于第j列
            if (A==1):
                import random
                a[i-1].append(random.randint(-10,10))
                b[i-1].append(random.randint(-10,10))
                c[i-1].append(0)
            elif(A==2):
                
                print("请输入a方阵第",i,"行 第",j,end="")      
                a[i-1].append(int(input("列:")))
                print("请输入b方阵第",i,"行 第",j,end="")        
                b[i-1].append(int(input("列:")))
                c[i-1].append(0)
        print("第一个",a)
        print("第二个",b)
        print("请确认：")
        x=int(input("1.计算 2.重新输入"))
        if (x==1):             #确认后计算
            for i in range(1,n+1):#第i行
                for j in range(1,n+1):#第j列
                    for x in range(1,n+1):#计算和
                        c[i-1][j-1]+=(a[i-1][x-1]*b[x-1][j-1])
                print(c[i-1])#打印该行
            break
        else:
            continue

#标签
label=Label(frame2,text='输入')

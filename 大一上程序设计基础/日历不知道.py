from tkinter import*
root=Tk()
root.title('日历')

#建立容器分区
frame1=Frame(root,width=200,height=20,bg='black')   #日期
frame1.grid(row=0)
frame2=Frame(root,width=200,height=20,bg='black')  #星期
frame2.grid(row=1)
frame3=Frame(root,width=200,height=120,bg='white')  #具体
frame3.grid(row=12)

#年月日标签
year=Label(frame1,text='年')
month=Label(frame1,text='月')
day=Label(frame1,text='日')

year.grid(row=0,column=1)
month.grid(row=0,column=3)
day.grid(row=0,column=5)

#年月日数值
year_1=StringVar()
month_1=StringVar()
day_1=StringVar()

year_0=Entry(frame1,width=4,state='readonly',textvariable=year_1)
month_0=Entry(frame1,width=2,state='readonly',textvariable=month_1)
day_0=Entry(frame1,width=2,state='readonly',textvariable=day_1)

year_0.grid(row=0,column=0)         #布局
month_0.grid(row=0,column=2)
day_0.grid(row=0,column=4)

year_1.set('2018')
month_1.set('3')
day_1.set('20')

#星期标签
xingqi=Label(frame2,text='日    一    二    三    四    五    六')#四个空格间距
xingqi.grid()
#翻页按钮


#具体日
L=[]
for i in range(0,7):
    for n in range(1,8):
        L.append(i)
list1=[]
list2=[]
for i,j in zip(range(0,42),L):
    list1.append(i)
    list2.append('a'+str(list1[i]))
    list2[i]=Button(frame3,text='日期',bg='white',width=2,height=1)
    list2[i].grid(row=j,column=i%7,padx=1,pady=1)




root.mainloop()

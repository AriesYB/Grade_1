from tkinter import*
root=Tk()
root.title('简易计算器')

#建立容器
frame1=Frame(root,width=300,height=150,bg='black')  #容纳框等
frame1.grid(row=0,padx=5,pady=5)
frame2=Frame(root,width=300,height=150,bg='black')  #容纳按键
frame2.grid(row=1,padx=5,pady=5)

#输出框
text_1=Text(frame1,width=30,height=8)
text_1.grid(padx=1,pady=1)



#按钮
list1=[]
list2=[]
for i,j in zip(range(0,20),[0,0,0,0,0,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3]):
    list1.append(i)
    list2.append('a'+str(list1[i]))
    list2[i]=Button(frame2,text=list1[i],bg='white',width=2,height=1)
    list2[i].grid(row=j,column=i%5,padx=1,pady=1)

root.mainloop()

from tkinter import*
import tkinter.messagebox               #引入消息框
import time                             #获取系统时间
root=Tk()
root.title('聊天窗口')


def enter(event):
    text_2.insert(END,'我  '+time.strftime('%H:%M:%S')+':'+'\n')
    text_2.insert(END,text_1.get('0.0',END))         #将输入框中的复制进消息框
    text_2.insert(END,'\n')
    text_1.delete('0.0',END)                         #清空输入框
    
def tip():
    tkinter.messagebox.askyesno('确认关闭窗口？')
        #关闭窗口
#def colse(event):
        #关闭窗口

 
#root.geometry('800x700)   固定窗口大小
    
 
#容器分区域
frame1=Frame(root,width=600,height=450,bg='black')      #消息区
frame1.grid(row=0,column=0,padx=5,pady=5,sticky=NW)

frame2=Frame(root,width=600,height=150,bg='black')      #输入区
frame2.grid(row=2,column=0,padx=5,pady=(5,30),sticky=N)

frame3=Frame(root,width=200,height=630,bg='black')      #联系人区
frame3.grid(row=0,column=1,rowspan=3,padx=5,pady=5,sticky=N)

frame4=Frame(root,width=600,height=20,bg='light blue')  #功能区
frame4.grid(row=1,column=0)

 
#按钮
enter0=Button(root,text=' 发 送 ',bg='blue',fg='white')   #跳转enter
enter0.grid(row=3,column=0,padx=5,pady=7,sticky=E)
enter0.bind('<Button-1>',enter)

close=Button(root,text=' 关 闭 ',bg='red',fg='black')            #需绑定
close.grid(row=3,column=0,padx=5,pady=7,sticky=W)

 
#文本框
text_1=Text(frame2,width=85,height=11)
text_1.grid(sticky=S)                             #输入

text_2=Text(frame1,width=85,height=34)
text_2.grid(sticky=N) #消息


#滚动条
#gundong=Scrollbar(frame1,orient=VERTICAL).grid()
#beijing=PhotoImage(file='gif0.gif')
#ent2.Image_create(image=beijing)



root.mainloop()

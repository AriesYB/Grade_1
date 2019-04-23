from tkinter import*
import tkinter.messagebox   #引入消息弹出框模块
def login(event):
    L.append(ent1.get())    #获取账号密码
    L.append(ent2.get())
    if (L[0]!=L[1]):        #密码错误提示
        tkinter.messagebox.showinfo('密码错误','请重新输入密码')
        ent2.delete(0,END)
    else:
        chat              #切换界面000000000000000000000000000000000000
        ent1.delete(0,END)
        ent2.delete(0,END)
        #关闭窗口000000000000000000000000000000000000000
def chat(event):            #聊天界面
    root=Tk()
    root.title('Small Chating')

window=Tk()
window.title("Small Chat")



#背景图片

#tu=Image(file='gif0.gif')
#

#

#便签
lab1=Label(window,text='Account Number',bg='blue',fg='white')
lab2=Label(window,text='Password',bg='blue',fg='white')
lab1.grid(row=0,column=0,padx=5,pady=12)
lab2.grid(row=1,column=0,padx=5,pady=12)

#输入框
ent1=Entry(window,width=20)
ent2=Entry(window,width=20)
ent1.grid(row=0,column=1,padx=10,pady=12)
ent2.grid(row=1,column=1,padx=10,pady=12)
ent2['show']='*'                        #密文（无延迟）

#按钮
but=Button(window,width=5,text='Login',bg='light blue')
but.grid(row=2,column=1,padx=5,pady=10)
but.bind('<Button-1>',login)

#获取的账号密码
L=[]
#提示账号输入错误
#
#
#
#



window.mainloop()

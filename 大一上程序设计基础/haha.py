from tkinter import*
import tkinter.messagebox
root=Tk()
root.title('嘻嘻嘻嘻')

def event():
    if tkinter.messagebox.askyesno('我想问你个问题','你是不是傻？'):
        tkinter.messagebox.showinfo('提示','你确定?')
        tkinter.messagebox.showinfo('哦','我觉得你应该不傻吧')
        tkinter.messagebox.showinfo('0.0','要不这样吧')
        tkinter.messagebox.showinfo('- -.','你确认3次自己傻好吧')
        tkinter.messagebox.showinfo('确认第一次自己傻','你觉得自己傻吗')
        tkinter.messagebox.showinfo('确认第二次自己','真的傻')
        tkinter.messagebox.showinfo('确认第三次自己','那好吧，你傻')
        tkinter.messagebox.showinfo('已经可以了','求你别说自己傻了')
        tkinter.messagebox.showinfo('唉','真可怜啊')
        tkinter.messagebox.showinfo('','好吧，我承认你傻')
    else:
        event()




event()


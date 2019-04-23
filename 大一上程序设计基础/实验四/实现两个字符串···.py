a=str(input("请输入第一个字串符："))
b=str(input("请输入第二个字串符："))
list=[a,b]
if (str(a)>str(b)):
    print("第一个更长")
elif(str(a)<str(b)):
    print("第二个更长")
else:
    print("一样长")
print("追加：",list[0]+list[1])
c,d=list[0],list[1]
print("拷贝：",c)
print("拷贝：",d)

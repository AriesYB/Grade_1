a=str(input("请输入一段字符"))
m=len(a)#字符的总个数 用来减去其他的
x=0
y=0
z=0
w=0#分别表示字母 空格 数字 其他字符的个数
n=0#字符第一个
while (m>0):
    b=int(ord(a[n]))#用每个字符的Asll值来比较
    if (65<=b<=90 or 97<=b<=112):
        x=x+1
    if (b==32):
        y=y+1
    if (48<=b<=57):
        z=z+1
    if n==m-1:
        break  #最后一个字符结束
    n=n+1
print("字母的个数",x)
print("空格的个数",y)
print("数字的个数",z)
print("其他字符的个数",m-(x+y+z))

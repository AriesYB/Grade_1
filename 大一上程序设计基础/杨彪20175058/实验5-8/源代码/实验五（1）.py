#对学生总成绩排名，并显示总分，平均分
#python 3.6.3 杨彪
Name,course_1,course_2,course_3,Sum,Average=[],[],[],[],[],[]#建立6个空列表
for i in range(1,6):
    Name.append(str(input("姓名：")))      #学生姓名的列表
    course_1.append(int(input("科目一;"))) #分数列表
    course_2.append(int(input("科目二;")))
    course_3.append(int(input("科目三;")))
A={}                                        #创建一个空字典
for i in range(0,5):
    Sum.append(course_1[i]+course_2[i]+course_3[i])#计算总分并放入总分的列表
    A[Sum[i]]=Name[i]                     #在字典中创建键，让姓名与总分相对应
Sum.sort()                  #正序排列
Sum.reverse()               #反过来变成倒序
print("姓名"," ","总分","平均分")
for i in range(0,5):
    print(A[Sum[i]]," ",Sum[i],(Sum[i])/3)

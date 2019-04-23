def downsort(list):
    #该函数用于数字列表的降序排序
    list.sort()
    list1=[]
    for i in (0,len(list)):
        list1.append(list(i))
    return list1
list=[156,349,15,2,8]
downsort(list)
print(list)

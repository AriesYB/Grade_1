# -*- coding: cp936 -*-
while(1):
    n=int(input("������n��ֵ�Դ���n�׷���:"))
    A=int(input("1.��ʼ���õ���ֵ    2.������ֵ"))
    a,b,c=[],[],[]#����0�б�
    for i in range(1,n+1):#�൱�ڵ�i��
        a.append([])#����i����
        b.append([])
        c.append([])
        for j in range(1,n+1):#�൱�ڵ�j��
            if (A==1):
                import random
                a[i-1].append(random.randint(-10,10))
                b[i-1].append(random.randint(-10,10))
                c[i-1].append(0)
            elif(A==2):
                
                print("������a�����",i,"�� ��",j,end="")      
                a[i-1].append(int(input("��:")))
                print("������b�����",i,"�� ��",j,end="")        
                b[i-1].append(int(input("��:")))
                c[i-1].append(0)
    print("��һ��",a)
    print("�ڶ���",b)
    print("��ȷ�ϣ�")
    x=int(input("1.���� 2.��������"))
    if (x==1):             #ȷ�Ϻ����
        for i in range(1,n+1):#��i��
            for j in range(1,n+1):#��j��
                for x in range(1,n+1):#�����
                    c[i-1][j-1]+=(a[i-1][x-1]*b[x-1][j-1])
            print(c[i-1])#��ӡ����
        break
    else:
        continue

KeyData=[2,5,"f","s","ad","Key","a","sd","f","x"]#假设一个数组
Index=0
Found=0
N=len(KeyData)
while (Found==0)and (Index<N):
    if (KeyData[Index]=="Key"):
        Found=1
        break
    else:
        Index=Index+1
if (Found==1):
    print(KeyData[Index-1])
else:
    print("The item you are searching for was not found.")

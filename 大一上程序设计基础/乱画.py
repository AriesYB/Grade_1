import turtle
def main():
    t=turtle.Turtle()
    t.hideturtle()
    drawFilledRectangle(t,15,15,200,200,"red","light blue")
def drawFilledRectangle(t,x,y,w,h,colorP="black",colorF="yellow"):
    for i in range(1,500):
        a=(x+i)*x/i
        b=(y+i)*y/i
        t.pencolor(colorP)
        t.fillcolor(colorF)
        t.up()
        t.goto(a+i,b+i)
        t.down()

        t.begin_fill()
        t.goto(a,b)
        t.goto(y,b+y)
        t.goto(a+x,x)
        t.goto(a,b)
        t.end_fill()
        

        t.begin_fill()
        t.goto(a,-b)
        t.goto(y,-b-y)
        t.goto(a+x,-x)
        t.goto(a,-b)
        t.end_fill()
        
        t.begin_fill()
        t.goto(-a,b)
        t.goto(-y,b+y)
        t.goto(-a-x,x)
        t.goto(-a,b)
        t.end_fill()

        
        t.begin_fill()
        t.goto(-a,-b)
        t.goto(-y,-b-y)
        t.goto(-a-x,-x)
        t.goto(-a,-b)
        t.end_fill()





#画圆    t.up()t.goto(0,0)    t.pencolor("black")    t.dot(150)   t.end_fill()
main()

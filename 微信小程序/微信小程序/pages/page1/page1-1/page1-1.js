Page({
  data:{
    thisfighter:[{
      title:"|*最辣鸡的职业*|",
      imagePath:"/images/110.png",
      name:"自杀君主",
      comment:"我能用各种方式自杀(눈_눈)"
    },
    {
      title: "|*不锈钢盆职业*|",
      imagePath: "/images/121.jpg",
      name: "天帝",
      comment: "圣耀B海博伦换瞎子3个不锈钢盆(눈_눈)"
    },
    {
      title: "|*亲儿子职业*|",
      imagePath: "/images/13.png",
      name: "红狗弑天",
      comment: "看不顺眼就扑上去咬(눈_눈)"
    }],
    fighterimage:
    [[{
      imagePath: "/images/110.png"
    },
    {
      imagePath: "/images/111.jpg"
    },
    {
      imagePath: "/images/11(1).gif"
    },
    {
      imagePath: "/images/11(2).gif"
    },
    {
      imagePath: "/images/11(3).gif"
    }, {
      imagePath: "/images/11(4).gif"
    },
    {
      imagePath: "/images/11(5).gif"
    }, {
      imagePath: "/images/11(6).gif"
    }, {
      imagePath: "/images/11(7).gif"
    },
    {
      imagePath: "/images/11(8).gif"
    }], [{
      imagePath: "/images/121.jpg"
    }, {
      imagePath: "/images/12(1).jpg"
    },
    {
      imagePath: "/images/12(2).jpg"
    },
    {
      imagePath: "/images/12(3).jpg"
    }], [{
      imagePath: "/images/13.png"
    },
    {
      imagePath: "/images/13.gif"
    },
    {
      imagePath: "/images/13(1).gif"
    },
    {
      imagePath: "/images/13(2).gif"
    }]],
    num:[
      [0,1,2,3,4,5,6,7,8,9],
      [0,1,2,3],
      [0,1,2,3]
    ],
    currentIndex: 0
  },
  onLoad:function(option){
    this.setData({
      currentIndex: this.data.fighterimage.length-1
    })
  },
  f0:function(event){
    this.setData({
      currentIndex:this.data.fighterimage.length-1
    })
  },
  f1:function(event){
    wx.navigateTo({
      url: '/pages/page1/page1-2/page1-2?id=77',
    })
  }
})
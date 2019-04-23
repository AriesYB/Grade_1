Page({
  tap0:function(event){
    for (let i = 0; i < 20; i++) {

    }
   this.setData({
     content:this.data.content+this.data.arr0[0]
     })
  },
  data:{
    content:'',
    arr0:['^', 7, 4, 1, '%'],
    arr1: ['/', 8, 5, 2, 0],
    arr2: ['*', 9, 6, 3, '.'],
    arr3: ['<—', '-', '+', '', '=']
  }
})
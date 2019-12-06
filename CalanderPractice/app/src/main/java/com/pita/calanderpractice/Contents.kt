package com.pita.calanderpractice

class Contents (val year:Int, val month:Int, val day:Int, val colorlist:IntArray) {
    //인덴트를 써서 ThirdPage에서 이 안으로 값이 들어오게 한다.
    var color1 = colorlist[0]
    var color2 = colorlist[1]
    var color3 = colorlist[2]
    var y = year
    var m = month
    var d = day

}
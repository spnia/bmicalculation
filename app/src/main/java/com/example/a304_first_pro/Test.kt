package com.example.a304_first_pro

open class person(){
    var name = "홍길동"
    constructor(n:String) : this() {
        name = n
    }

    open fun intro(){
        println("안녕, 난 ${name}이야.")
    }
}

class student:person{
    var major = "행정사무"
    constructor(n:String, m:String):super(n) {
        major = m
    }
    override fun intro(){
        println("안녕, 난 ${name}이고, 전공은 ${major}야.")
    }
}

class teacher:person{
    var age = 50
    var majors = "전공"
    constructor(n:String, a:Int, c:String):super(n){
        majors = c
    }
    override fun intro(){
        println("안녕, 난 ${name}이고, 나이는 ${age}살이고 전공은 ${majors}이야.")
    }
    fun birth(){
        println("내가 태어난 년도는 ${2023-age+1}이야.")
    }
}

fun main() {
    var p1 = person("이순신")
    p1.intro()
    var s1 = student("박명수", "IT과")
    s1.intro()
    var t1 = teacher("정준하", 50, "3학년 5반 담임")
    t1.intro()
    t1.birth()

    fun sum1(n1:Int, n2:Int):Int{
        return n1+n2
    }
    var sum2 = {n3:Int, n4:Int -> n3+n4}

    println(sum1(10,20))
    println(sum2(20,30))
}

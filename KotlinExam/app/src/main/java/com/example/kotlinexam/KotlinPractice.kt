package com.example.kotlinexam


// 1.Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다.  fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}


val square :  (Int) -> (Int) ={number -> number*number}

val nameAge = {name : String, age :  Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("ASD",99))
    val a = "ASD"
    val b = "DSA"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))
    println(calculateGrade(97))
    println(calculateGrade(977))


    val lamda =  {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))
    // 소괄호 생략 가능
    println(invokeLamda{it > 3.22})



}

//확장 함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String{

    val intoduceMyself : String.(Int) -> String = {"I'm ${this} and ${it} years old"}
    return name.intoduceMyself(age)

}

//람다의 return

val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71.. 100 -> "pefect"
        else -> "Error"
    }
}

//람다를 표현하는 다양한 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}
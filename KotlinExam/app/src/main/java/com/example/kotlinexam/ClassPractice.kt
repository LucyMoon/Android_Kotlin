package com.example.kotlinexam

open class Human constructor(val name : String = "Anonymous"){
    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, ${age}years old")
    }
    init{
        println("New Human has been born!!")
    }
    fun eatingCake() {
        println("EatingCake")
    }
    open fun singAsong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singAsong(){
        super.singAsong()
        println("라라라")
        println("my name is : ${name}")
    }
}


fun main(){
    val korean = Korean()
    korean.singAsong()
}
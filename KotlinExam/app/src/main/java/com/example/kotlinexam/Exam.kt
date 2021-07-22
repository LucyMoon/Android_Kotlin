package com.example.kotlinexam

fun main(){
    helloworld()

    println(add(4, 5))

    // 3. String Template
    val name = "TaeHwan"
    val lastname = "Kim"
    println("my name is ${name + lastname} I'm 17")
}

//4. 조건식

fun maxBy(a : Int, b : Int) : Int{
    if(a>b){
        return a
    }
    else {
        return b
    }
}
fun maxBy2(a : Int, b : Int) = if(a > b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")   //else 필수아님
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3    //else 필수
    }

    when (score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//1. 함수
fun helloworld() {
    println("Hello World!")
}

//return + 파라미터 있는 함수
fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val, var 차이
// val = value = 값
fun hi(){
    val a : Int = 10  //변할 수 없는 값
    var b : Int = 9   //변할 수 있는 값
    val c = 100 // 인트인지를 안 알려주어도 자동으로 인식
    var d = 100 // 인트인지를 안 알려주어도 자동으로 인식
    var name = "TaeHwan"
}


// 5. Array and List
// Array
// List 1. List(수정불가) 2. MutableList(수정가능)

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3 //가능
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// 6. for / While

fun forandwhile() {
    val students = arrayListOf("joyce","james","jenny","Jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index,name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2){    // i 를 1~10까지 돌리는데 i를 2씩 더해라
        //(i in 10 downTo 1) 10부터 --하며 수를 센다
        //(i in until 100) 100을 제외한 1~99까지 돌아감
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }

}


// 7. Nullable

fun nullcheck(){
    var name : String = "asd"

    var nullName : String? = null   // ? 넣으면 null 허용

    var nameInUpperCase : String = name.toUpperCase()

    var nullNameInUpperCase : String? = nullName?.toUpperCase()

    // ?:  만약 null일때 출력할 값

    val lastName : String? = null

    val fullName : String = name +" "+ (lastName?: "No lastName")
    println(fullName)


}

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!  //str이 절대 null이 아닐때 !! 붙인다
    val upper : String = mNotNull.toUpperCase()


    val email : String? = "asd@asd.com"
    email?.let{
        println("my email is ${email}")
    }

}

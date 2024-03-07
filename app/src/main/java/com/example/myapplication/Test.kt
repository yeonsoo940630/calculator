package com.example.myapplication


class Calculator{
    fun test(){
        while(true){
            println("첫번째 숫자를 입력하세요")
            var num1 = readLine()!!.toInt()

            println("연산자를 선택하세요")
            println("더하기는 +")
            println("빼기는 -")
            println("곱하기는 *")
            println("나누기는 /")
            println("나머지는 %")
            var operation = readLine()!!.toString()

            println("두번째 숫자를 입력하세요")
            var num2 = readLine()!!.toInt()

            when(operation) {
                "+" -> {
                    println("${num1 + num2}")
                }
                "-" -> {
                    println("${num1 - num2}")
                }
                "*" -> {
                    println("${num1 * num2}")
                }
                "/" -> {
                    println("${num1 / num2} 나머지는 ${num1 % num2}입니다")
                }
                "%" -> {
                    println("${num1 % num2}")
                }
                else -> println("올바른 연산자를 입력해주세요")
            }
            println("새로운 계산이 시작됩니다")
        }
    }
}

fun main() {
    val cal = Calculator()
    cal.test()
}






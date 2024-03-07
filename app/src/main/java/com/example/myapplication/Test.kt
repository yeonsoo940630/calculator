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

            var add = AddOperation()
            var sub = SubstractOperation()
            var mul = MultiplyOperation()
            var div = DivideOperation()

            when(operation) {
                "+" -> {
                    add.a(num1, num2)
                }
                "-" -> {
                    sub.a(num1, num2)
                }
                "*" -> {
                    mul.a(num1, num2)
                }
                "/" -> {
                    div.a(num1, num2)
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

class AddOperation{
    fun a(num1: Int, num2: Int) {
        println("${num1 + num2}")
    }
}

class SubstractOperation{
    fun a(num1: Int, num2: Int) {
        println("${num1 - num2}")
    }
}

class MultiplyOperation{
    fun a(num1: Int, num2: Int) {
        println("${num1 * num2}")
    }
}

class DivideOperation{
    fun a(num1: Int, num2: Int) {
        println("${num1 / num2} 나머지는 ${num1 % num2}입니다")
    }
}

fun main() {
    val cal = Calculator()
    cal.test()
}






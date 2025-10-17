package ch03

fun main() {
    var calc = Calculator()

    var intResult = calc.add(1,2)
    var doubleResult = calc.add(1.2, 2.2)

    println("정수 덧셈결과: ${intResult}")
    println("실수 덧셈결과: ${doubleResult}")

}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        println("int형 add 입니다.")
        return num1+num2
    }

    fun add(num1: Double, num2: Double): Double {
        println("double형 add 입니다.")
        return num1+num2
    }
}
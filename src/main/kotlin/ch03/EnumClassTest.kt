package ch03

enum class ProgrammingLanguage {
    C, JAVA, KOTLIN
}

enum class ProgrammingLanguageWithInt(val code: Int) {
    C(10),
    JAVA(20),
    KOTLIN(30)
}

fun main() {
    println(ProgrammingLanguage.C) // 출력: C
    println(ProgrammingLanguage.C.toString()) // 출력: C
    println(ProgrammingLanguageWithInt.KOTLIN.code) // 출력: 30
    println(ProgrammingLanguageWithInt.KOTLIN.name) // 출력: KOTLIN
}
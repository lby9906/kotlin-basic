fun main() {
    println("메뉴를 입력해주세요.")
    println("게임 시작하기 메뉴 1 | 게임 끝내기 메뉴 2 : ")
    val select = readLine()!!.toInt()
    when (select) {
        1 -> startGame()
        2 -> endGame()
    }
}

fun startGame() {
    println("게임이 시작되었습니다.")
}

fun endGame() {
    println("게임이 종료되었습니다.")
}

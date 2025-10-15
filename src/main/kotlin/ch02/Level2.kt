package ch02

fun main() {
    println("메뉴를 입력해주세요.")
    println("게임 시작하기 메뉴 1 | 게임 끝내기 메뉴 2  | 캐릭터 추가 3: ")
    val select = readLine()!!.toInt()
    when (select) {
        1 -> startGame2()
        2 -> endGame2()
        3 -> createCharacter2()
    }
}

fun startGame2() {
    println("게임이 시작되었습니다.")
}

fun endGame2() {
    println("게임이 종료되었습니다.")
}

fun createCharacter() {
    val add: MutableMap<String, String> = mutableMapOf()

    while (true) {
        println("추가할 캐릭터의 이름을 입력해주세요: ")
        val name = readLine()!!.toString()

        println("추가할 캐릭터의 직업을 입력해주세요: ")
        val job = readLine()!!.toString()

        add[name] = job

        println("더 추가하시겠습니까?")
        println("추가하려면 Y | 추가한 캐릭터 목록 보기 N을 입력해주세요: ")

        var selectInput = readLine()!!.toString()
        when(selectInput) {
            "Y" -> continue
            "N" -> {
                println(add)
                break
            }
            else -> {
                println("목록에 있는 Y/N만 입력해주세요")
                break
            }
        }
    }
}

fun createCharacter2() {
    val charactorList: MutableList<Map<String, String>> = mutableListOf()

    var isNeedMoreCharactor = "Y"

    while (isNeedMoreCharactor == "Y") {
        println("추가할 캐릭터의 이름을 입력해주세요")
        val name = readLine() ?: ""

        println("추가할 캐릭터의 직업을 입력해주세요")
        val job = readLine() ?: ""

        val charactor = mapOf("name" to name, "job" to job)

        charactorList.add(charactor)

        println("사용자를 더 추가하시겠습니까? (Y:추가, N: 그만두기)")
        isNeedMoreCharactor = readLine() ?: "N"
    }

    charactorList.forEach {
        println(it)
    }
}

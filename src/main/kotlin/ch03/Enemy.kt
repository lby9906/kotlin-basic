package ch03

class Enemy(
    val name: String,
) {
    val attackPoint: Int = 10
    var healthPoint: Int = 100

    fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }
}
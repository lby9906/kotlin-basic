package ch02

class Hero {
    var damage = 10
    var healthPoint = 100

    fun attack(target: Enemy) {
        println("공격했다!")
        target.takeAttack(this.damage)
    }
}

class Enemy {
    var damage = 10
    var healthPoint = 100

    fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }
}


fun main() {
    val hero = Hero()
    val enemy = Enemy()

    hero.attack(enemy)
}
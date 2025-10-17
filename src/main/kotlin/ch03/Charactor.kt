package ch03

class Armor(val defensePoint: Int) {
    fun getDefenseDamage(demage: Int): Int {
        return demage - defensePoint
    }
}

class Charactor(
    val armor: Armor?,
) {
    val demage = 10
    var healthPoint = 100

    fun attack(target: Charactor) {
        target.takeAttack(demage)
    }

    open fun takeAttack(demage: Int) {
        val defensedDamage = armor?.getDefenseDamage(demage) ?: demage
        healthPoint -= defensedDamage
    }
}

fun main() {
    val charactorWithoutArmor = Charactor(null)
    val charactorWithArmor = Charactor(Armor(3))

    charactorWithoutArmor.takeAttack(10)
    println(charactorWithoutArmor.healthPoint)

    charactorWithArmor.takeAttack(10)
    println(charactorWithArmor.healthPoint)
}
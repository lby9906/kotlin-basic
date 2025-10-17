package ch03

open class Charactor1() {
    val demage = 10
    var healthPoint = 100

    fun attack(target: Charactor) {
        target.takeAttack(demage)
    }

    open fun takeAttack(demage: Int) {
        healthPoint -= demage
    }
}

class CharacterWithArmor: Charactor1() {
    val defensePoint = 3

    override fun takeAttack(damege: Int) {
        val actualDamage = demage - defensePoint

        super.takeAttack(actualDamage)
    }
}
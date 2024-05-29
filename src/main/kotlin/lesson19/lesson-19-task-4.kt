package lesson19

enum class BulletType(val damage: Int) { Red(20), Blue(5), Green(10), NotLoaded(0) }

class Tank(
    gunType: BulletType = BulletType.NotLoaded

) {
    private var currentGunType: BulletType = gunType

    fun changeGun(newGun: BulletType) {
        currentGunType = newGun
    }

    fun shut() = println("Наношу урон ${currentGunType.damage}")
}

fun main() {
    val tank = Tank()
    tank.shut()
    tank.changeGun(BulletType.Red)
    tank.shut()
    tank.changeGun(BulletType.Blue)
    tank.shut()
    tank.changeGun(BulletType.Green)
    tank.shut()
}
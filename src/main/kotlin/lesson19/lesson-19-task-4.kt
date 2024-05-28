package lesson19

enum class BulletType {
    Red {
        override val power: Int
            get() = 20
    },
    Blue {
        override val power: Int
            get() = 5
    },
    Green {
        override val power: Int
            get() = 10
    };

    abstract val power: Int
}

class Tank(

) {
    private var currentGunType: BulletType = BulletType.Red

    fun changeGun(newGun: BulletType) {
        currentGunType = newGun
    }

    fun shut() = println("Наношу урон ${currentGunType.power}")
}

fun main() {
    val tank = Tank()
    tank.shut()
    tank.changeGun(BulletType.Blue)
    tank.shut()
    tank.changeGun(BulletType.Green)
    tank.shut()
}
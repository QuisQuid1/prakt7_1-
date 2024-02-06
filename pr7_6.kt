import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.cos

fun main() {
    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        val a = sqrt(sin(x) * sin(x) + cos(y.pow(3.0)) * cos(y.pow(3.0)))
        println("Решение примера: $a")
    } catch (e: Exception) {
        println("Что то не то")
    }
}
import kotlin.math.pow

fun main() {
    val R = readLine()!!.toDouble()
    val pi = 3.14159
    val volume = String.format("%.3f", (4*pi*R.pow(3)/3))
    println("VOLUME = $volume")
}
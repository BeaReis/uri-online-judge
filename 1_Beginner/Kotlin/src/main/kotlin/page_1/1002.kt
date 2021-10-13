import kotlin.math.pow

fun main() {
    val R = readLine()!!.toDouble()
    val pi = 3.14159
    val A = String.format("%.4f", pi*R.pow(2))
    println("A = $A")
}
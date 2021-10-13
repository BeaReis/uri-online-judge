import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val read = readLine()!!.split(" ").map{ it.toDouble() }
    val a = read[0]
    val b = read[1]
    val c = read[2]
    val R = arrayOf(0.0,0.0)
    if (a != 0.0 && ((b.pow(2) - (4 * a * c)) >= 0.0)) {
        R[0] = (-b + sqrt(b.pow(2) - 4 * a * c))/(2 * a)
        R[1] = (-b - sqrt(b.pow(2) - 4 * a * c))/(2 * a)
        println("R1 = ${String.format("%.5f", R[0])}\n" +
                "R2 = ${String.format("%.5f", R[1])}")
    } else println("Impossivel calcular")

}
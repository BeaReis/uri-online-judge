import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val p1 = readLine()!!.split(" ").map{ it.toDouble() }
    val p2 = readLine()!!.split(" ").map{ it.toDouble() }
    val distance = String.format("%.4f", sqrt((p2[0]-p1[0]).pow(2) + (p2[1]-p1[1]).pow(2)))
    println(distance)
}
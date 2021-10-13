
fun main() {
    val X = readLine()!!.toInt()
    val Y = readLine()!!.toFloat()
    val consumption = String.format("%.3f", (X/Y))
    println("$consumption km/l")
}
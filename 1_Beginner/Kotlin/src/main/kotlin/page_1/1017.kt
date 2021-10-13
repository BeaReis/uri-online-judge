
fun main() {
    val time = readLine()!!.toInt()
    val avgVelocity = readLine()!!.toInt()
    val autonomy = 12
    val fuel = ((avgVelocity*time).toDouble()/autonomy)
    println(String.format("%.3f", fuel))
}
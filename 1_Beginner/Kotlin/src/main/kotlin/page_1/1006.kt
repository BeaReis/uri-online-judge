
fun main() {
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val C = readLine()!!.toDouble()
    val media = String.format("%.1f", (A*2+B*3+C*5)/10)
    println("MEDIA = $media")
}
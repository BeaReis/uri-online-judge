
fun main() {
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val media = String.format("%.5f", (A*3.5+B*7.5)/11)
    println("MEDIA = $media")
}
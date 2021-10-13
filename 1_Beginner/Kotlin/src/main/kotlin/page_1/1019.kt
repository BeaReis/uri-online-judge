
fun main() {
    val N = readLine()!!.toInt()
    var idade = N / 365
    println("$idade ano(s)")
    idade = N % 365 / 30
    println("$idade mes(es)")
    idade = N % 365 % 30
    println("$idade dia(s)")
}

fun main() {
    val N = readLine()!!.toInt()
    var resto = 0
    println(N)
    println("${N/100} nota(s) de R$ 100,00")
    resto = N % 100
    println("${resto/50} nota(s) de R$ 50,00")
    resto %= 50
    println("${resto/20} nota(s) de R$ 20,00")
    resto %= 20
    println("${resto/10} nota(s) de R$ 10,00")
    resto %= 10
    println("${resto/5} nota(s) de R$ 5,00")
    resto %= 5
    println("${resto/2} nota(s) de R$ 2,00")
    resto %= 2
    println("${resto/1} nota(s) de R$ 1,00")

}
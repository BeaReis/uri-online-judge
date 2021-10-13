import java.math.RoundingMode

fun main() {
    val N = readLine()!!.toDouble()
    var resto = 0.00
    //O uso do 'toInt' leva o código a considerar apenas os inteiros no momento do print
    println("NOTAS:")
    println("${(N/100).toInt()} nota(s) de R$ 100.00")
    resto = N % 100
    println("${(resto/50).toInt()} nota(s) de R$ 50.00")
    resto %= 50
    println("${(resto/20).toInt()} nota(s) de R$ 20.00")
    resto %= 20
    println("${(resto/10).toInt()} nota(s) de R$ 10.00")
    resto %= 10
    println("${(resto/5).toInt()} nota(s) de R$ 5.00")
    resto %= 5
    println("${(resto/2).toInt()} nota(s) de R$ 2.00")
    resto %= 2
    println("MOEDAS:")
    println("${(resto/1).toInt()} moeda(s) de R$ 1.00")
    resto %= 1
    println("${(resto/0.50).toInt()} moeda(s) de R$ 0.50")
    resto %= 0.50
    println("${(resto/0.25).toInt()} moeda(s) de R$ 0.25")
    resto %= 0.25
    println("${(resto/0.10).toInt()} moeda(s) de R$ 0.10")
    resto %= 0.10
    println("${(resto/0.05).toInt()} moeda(s) de R$ 0.05")
    resto %= 0.05
    println("${(resto/0.01).toBigDecimal().setScale(0,RoundingMode.HALF_UP)} moeda(s) de R$ 0.01")

}
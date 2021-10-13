
fun main() {
    val read = readLine()!!.toDouble()
    if (read in 0.0..25.00) println("Intervalo [0,25]")
    else if (read > 25.0 && read <= 50.00) println("Intervalo (25,50]")
    else if (read > 50.00 && read <= 75.00) println("Intervalo (50,75]")
    else if (read > 75.00 && read <= 100.00) println("Intervalo (75,100]")
    else println("Fora de intervalo")
}
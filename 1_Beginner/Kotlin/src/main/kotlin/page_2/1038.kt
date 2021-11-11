package page_2

fun main() {

    val read = readLine()!!.split(" ").map{ it.toInt() }
    val x = read[0]
    val y = read[1]
    var total = 0.00

    when(x) {
        1 -> total = y * 4.00
        2 -> total = y * 4.50
        3 -> total = y * 5.00
        4 -> total = y * 2.00
        5 -> total = y * 1.50
    }
    println("Total: R$ ${String.format("%.2f",total)}")

}
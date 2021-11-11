package page_2

fun main() {

    val (x,y) = readLine()!!.split(" ").map { it.toDouble() }
    if (x > 0.0 && y > 0.0) {
        println("Q1")
    } else if (x < 0.0 && y > 0.0) {
        println("Q2")
    } else if (x < 0.0 && y < 0.0) {
        println("Q3")
    } else if (x > 0.0 && y < 0.0) {
        println("Q4")
    } else if (x == 0.0 && y != 0.0) {
        println("Eixo Y")
    } else if (x != 0.0 && y == 0.0) {
        println("Eixo X")
    } else {
        println("Origem")
    }

}
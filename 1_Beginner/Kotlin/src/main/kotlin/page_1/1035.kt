
fun main() {
    val read = readLine()!!.split(" ").map{ it.toInt()}
    val A = read[0]
    val B = read[1]
    val C = read[2]
    val D = read[3]
    if (B > C &&
        D > A &&
        (C+D > A+B) &&
        C >= 0 &&
        D >= 0 &&
        A % 2 == 0) println("Valores aceitos") else println("Valores nao aceitos")
}
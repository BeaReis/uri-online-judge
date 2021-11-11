package page_2

fun main() {
    val read = readLine()!!.split(" ").map{ it.toDouble() }
    val avg = read.sum()/read.size
    println("Media: ${String.format("%.1f",avg)}")

    if (avg >= 7.0) println("Aluno aprovado.")
    else if (avg < 5.0) println("Aluno reprovado.")
    else {
        println("Aluno em exame.")

        val readExtra = readLine()
        println("Nota do exame: $readExtra")

        val newAvg = (avg + readExtra.toString().toDouble())/2
        if (newAvg >= 5) println("Aluno aprovado.") else println("Aluno reprovado.")

        println("Media final: ${String.format("%.1f",avg)}")
    }
}
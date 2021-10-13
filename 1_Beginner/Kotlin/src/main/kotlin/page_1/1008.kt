
fun main() {
    val id = readLine()!!.toInt()
    val workedHours = readLine()!!.toInt()
    val amountPerHour = readLine()!!.toFloat()
    val salary = String.format("%.2f", workedHours*amountPerHour)
    println("NUMBER = $id\nSALARY = U$ $salary\n");
}
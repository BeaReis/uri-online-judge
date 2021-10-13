import java.lang.Math.round
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val name = readLine()!!.toString()
    val salary = readLine()!!.toDouble()
    val sales = readLine()!!.toDouble()
    val totalSalary = salary+0.15*sales
    val total = BigDecimal(totalSalary).setScale(2, RoundingMode.HALF_EVEN)
    println("TOTAL = R$ $total")
}
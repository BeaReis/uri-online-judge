
import java.util.*

fun main() {
    /* [PT-BR]
        O comando readLine() aceita apenas 1 input em uma mesma linha, logo considerei a leitura como uma String,
        segmentei essa String a partir dos espaços vazios " " e formei uma lista de Strings com o uso do 'map'.
        Finalmente, criei variáveis para os valores utilizados nos cálculos e converti para o tipo de input pedido.

       [ENG]
        Command readLine() accepts only 1 input in the same line, therefore I considered the input as a String.
        Then I split this String using blank spaces " " and created a list of Strings through 'map'.
        Finally, I created variables and converted the items used in the calculation to the input type required.
     */
        val product1 = readLine()!!.split(" ").map { it.toString() }
        val n1 = product1[1].toInt()
        val price1 = product1[2].toDouble()

        val product2 = readLine()!!.split(" ").map { it.toString() }
        val n2 = product2[1].toInt()
        val price2 = product2[2].toDouble()

        val total = n1*price1+n2*price2
        val final = String.format("%.2f", total)
        println("VALOR A PAGAR: R$ $final")
}
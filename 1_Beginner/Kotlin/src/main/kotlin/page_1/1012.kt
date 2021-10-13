
fun main() {
    /* [PT-BR]
       O comando readLine() aceita apenas 1 input em uma mesma linha, logo considerei a leitura como uma String,
       segmentei essa String a partir dos espaços vazios " " e usei o 'map' para converter os trechos de String em.
       Double. Finalmente, criei variáveis para receber os valores Double.

       [ENG]
       Command readLine() accepts only 1 input in the same line, therefore, I considered the input as a String.
       Then I split this String using blank spaces " " and used 'map' to convert the String segments to Double.
       Finally, I created variables to receive the Double values.
    */
       val read = readLine()!!.split(" ").map { it.toDouble() }
       val A = read[0]
       val B = read[1]
       val C = read[2]

       println("TRIANGULO: ${String.format("%.3f", A*C/2)}\n" +
               "CIRCULO: ${String.format("%.3f",3.14159*C*C)}\n" +
               "TRAPEZIO: ${String.format("%.3f",(A+B)*C/2)}\n" +
               "QUADRADO: ${String.format("%.3f",B*B)}\n" +
               "RETANGULO: ${String.format("%.3f",A*B)}")
}
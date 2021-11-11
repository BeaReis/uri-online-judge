package page_2

fun main() {
    val (a,b,c) = readLine()!!.split(" ").map{ it.toInt() }
    //[PT-BR] Criei uma lista organizada de forma ascendente usando 'listOf()' e '.sorted()'
    //[ENG] I created a list of elements sorted in an ascending manner using 'listOf() and '.sorted'
    val list = listOf(a,b,c).sorted()
    println("${list[0]}\n" +
            "${list[1]}\n" +
            "${list[2]}\n\n" +
            "$a\n" +
            "$b\n" +
            "$c")

}
package maisDezExercicios

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    println("Digite 15 alturas de pessoas diferentes: ")

    var maiorH = 0.0
    var menorH = Double.MAX_VALUE

    for (h in 1..15) {
        val altura: Double = sc.nextDouble()

        if (altura == 0.0) {
            maiorH = altura
            menorH = altura
        }
        else if (altura > maiorH) {
            maiorH = altura
        }
        else if (altura < menorH) {
            menorH = altura
        }
    }
    println("A maior altura é: $maiorH")
    println("A menor altura é: $menorH")
}





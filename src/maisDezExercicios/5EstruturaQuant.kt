package maisDezExercicios

import java.util.*
//Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
//Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
//números lidos. O número que encerrará a leitura será zero.

fun main() {
    val sc = Scanner(System.`in`)
    println("Informe um número inteiro positivo: ")
    var num = 1
    var mediaPar = 0.0
    val mediaGeral: Double
    var contP = 0.0
    var contI = 0.0
    var somaP = 0.0
    var somaI = 0.0

    //valor != (0) - para parar a entrada de valores

    while (num != (0)) {
        num = sc.nextInt()

        if (num > 0 && num %2 == 0) {
            contP += 1
            somaP += num
            mediaPar = (somaP / contP)
        }
        if (num > 0 && num %2 != 0) {
            contI += 1
            somaI += num

        }

    }
    mediaGeral = ((somaP+somaI)/(contP+contI))
    println()
    println("Quantidade de números pares: $contP")
    println("Quantidade de números ímpares: $contI")
    print("Média dos valores pares: ")
    println("%.2f".format(mediaPar))
    print("Média geral dos valores: ")
    println("%.2f".format(mediaGeral))

}


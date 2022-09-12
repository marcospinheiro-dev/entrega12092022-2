package maisDezExercicios

import java.util.*
//Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
//média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
//negativos e o percentual de valores negativos e positivos.
//Talvez eu não tenha entendido a questão como deveria ser.
fun main() {
    val sc = Scanner(System.`in`)
    println("Informe um número inteiro positivo ou negativo: ")
    var valor = 0.0
    var qtdValoresPosit = 0.0
    var qtdValoresNegat = 0.0
    var somaP = 0.0
    var somaN = 0.0
    var mediaAritmP = 0.0
    var mediaAritmN = 0.0

    //valor != (-1) - para parar a entrada de valores
    //Não consegui criar uma variável para sair do while que não fosse um número, e isso afeta o sistema
    //referente a valores, médias e quantidades
    while (valor != (-1.0)) {

        valor = sc.nextDouble()

        if (valor > 0) {
            qtdValoresPosit += 1
            somaP += valor
            mediaAritmP = somaP/qtdValoresPosit


        }
        else if (valor < 0) {
            qtdValoresNegat += 1
            somaN += valor
            mediaAritmN = somaN/qtdValoresNegat

        } else {
            println("Valor incorreto!")
        }


    }
    val percentPosit: Double = (qtdValoresPosit/(qtdValoresPosit + qtdValoresNegat))*100
    val percentNegat: Double = (qtdValoresNegat/(qtdValoresPosit + qtdValoresNegat))*100
    println()
    println("Quantidade de valores positivos: $qtdValoresPosit")
    println("Quantidade de valores negativos: $qtdValoresNegat")
    println("O valor total dos números positivos é: $somaP")
    println("O valor total dos números negativos é: $somaN")
    println("A média dos números positivos é: $mediaAritmP")
    println("A média dos números negativos é: $mediaAritmN")
    print("Percentual referente às entradas positivas: ")
    println("%.2f".format(percentPosit))
    print("Percentual referente às entradas negativas: ")
    println("%.2f".format(percentNegat))

}


package maisDezExercicios

import java.util.*
//Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
//estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
//terminar quando for lido um número negativo.

fun main() {

    val sc = Scanner(System.`in`)
    println("Informe um número inteiro positivo: ")

    var numero = 0
    var cont1 = 0
    var cont2 = 0
    var cont3 = 0
    var cont4 = 0


    //valor != (-1) - para parar a entrada de valores
    while (numero != (-1)) {
        numero = sc.nextInt()

        if (numero in 0..25) {
            cont1++
        }
        if (numero in 26..50) {
            cont2++
        }
        if (numero in 51..75) {
            cont3++
        }
        if (numero in 76..100) {
            cont4++
        }
    }
    println("No intervalo [0-25] tem $cont1 números")
    println("No intervalo [26-50] tem $cont2 números")
    println("No intervalo [51-75] tem $cont3 números")
    println("No intervalo [76-100] tem $cont4 números")
}


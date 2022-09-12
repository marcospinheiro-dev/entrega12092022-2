package maisDezExercicios

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)


    println("Digite um número inteiro: ")
    val numFat: Int = sc.nextInt()
    var fatorial = 1

    for (num in 1..numFat) {

        fatorial *= num


        println(num)
    }

    println(fatorial)
}





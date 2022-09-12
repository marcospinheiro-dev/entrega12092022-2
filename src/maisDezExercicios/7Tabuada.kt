package maisDezExercicios

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    println("Digite um número inteiro para formar a tabuada: ")
    val numero: Int = sc.nextInt()
    var resultado: Int

    for (num in 0..10) {

        resultado = numero * num
        println("$num   x   $numero   =  $resultado")
    }
}


package maisDezExercicios

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    print("Qual o primeiro termo da PG? ")
    var a1: Int = sc.nextInt()
    print("Digite a razão da PG: ")
    val razao: Int = sc.nextInt()

    for (num in 1..10) {
        a1 *= razao

        println(a1)
    }
}

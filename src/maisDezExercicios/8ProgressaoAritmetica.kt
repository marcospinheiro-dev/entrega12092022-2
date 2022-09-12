package maisDezExercicios

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Qual o primeiro termo da PA? ")
    var a: Int = sc.nextInt()
    print("Digite a razão da PA: ")
    val razao: Int = sc.nextInt()

    for (num in 1..10) {
        a += razao

        println(a)
    }

}

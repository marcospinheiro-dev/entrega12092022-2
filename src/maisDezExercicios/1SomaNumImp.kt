package maisDezExercicios


fun main() {

    var soma = 0
    for (num in 1..500) {
        if(num % 3 == 0 && num % 2 != 0){
            soma += num
        }
    }
    println(soma)
}
fun fizzBuzz(n: Int): List<String> {
    var result: List<String> = listOf()

    for(i in 1..n) {
        if(i % 3 == 0 && i % 5 == 0) {
            result += "FizzBuzz"
        } else if(i % 3 == 0) {
            result += "Fizz"
        } else if(i % 5 == 0) {
            result += "Buzz"
        } else {
            result += "$i"
        }
    }

    return result
}

fun main() {
    fizzBuzz(3)
}
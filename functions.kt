
import java.util.Scanner


fun main(args: Array<String>) {
    print("Votre nombre: ")
    val reader = Scanner(System.`in`)
    val intInput: Int = reader.nextInt()
    println("You entered: $intInput")

    do {
        val testInput: Int = reader.nextInt()
        if ("$intInput" == "$testInput") {
            println("c'est le bon chiffre.")
        }
        else {
            if ("$intInput" < "$testInput") {
                println("C'est moins.")
            } else {
                println("C'est plus.")
            }
        }
    }
    while ("$intInput" != "$testInput")
}
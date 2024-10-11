import kotlin.text.*

fun helloWorld() {
    println("Hello World!")
    println()
}

fun enterWord() {
    print("Enter a word: ")
    val word = readln()
    print("You entered the word: ")
    print(word)
    println()
}

fun main() {
    helloWorld()
    enterWord()
}
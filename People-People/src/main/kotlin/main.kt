fun main() {
    val likes = 121
    if (likes == 1 || likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}
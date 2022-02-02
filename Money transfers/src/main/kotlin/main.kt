fun main() {
    val amount = 10 * 100.0
    var commission = amount * 0.0075
    if (commission < 35) {
        commission = 35.00
    }
    println("Комиссия равна: $commission")
}
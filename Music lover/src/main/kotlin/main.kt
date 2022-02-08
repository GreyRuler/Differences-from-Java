fun main() {
    val totalPrice = 1_000
    val discount = if (totalPrice in 1001..10000) 100 else if (totalPrice >= 10001) totalPrice * 0.05 else 0
    val musicLover = true
    val totalDiscount = if (musicLover) (discount.toInt()+(totalPrice - discount.toInt()) * 0.01).toInt() else discount
    println(totalDiscount)
}
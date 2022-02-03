fun main() {
    val totalPrice = 1_000
    val discount = if (totalPrice in 1001..10000) 100 else if (totalPrice >= 10001) totalPrice * 0.05 else 0
    val musicLover = true
    val customerDiscount = (totalPrice.toDouble() - discount.toDouble()) * 0.01
    val totalDiscount = if (musicLover) (discount.toDouble()+customerDiscount) else discount
}
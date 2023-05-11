// Functions: piping, declared own sum
package _08_piping

data class Item(val title: String, val price: Int)
data class Order(val orderId: Int, val items: List<Item>)

fun totalRevenueOfImportantOrders(orders: List<Order>): Int =
    orders.filter { order -> order.items.any { it.price > 5 } }
        .flatMap { it.items }
        .map { it.price }
        .reduce { x, y -> x + y }

// Any questions?

class Item:
    def __init__(self, title: str, price: int):
        self.title = title
        self.price = price


class Order:
    def __init__(self, order_id: int, items: [Item]):
        self.order_id = order_id
        self.items = items


def total_revenue_of_important_orders(orders: [Order]):
    return sum(
        [item.price
         for order in filter(lambda order: any([item.price > 5 for item in order.items]), orders)
         for item in order.items]
    )


def total_revenue_of_important_orders_mutable_variables(orders: [Order]):
    orders = filter(lambda order: any([item.price > 5 for item in order.items]), orders)
    prices = [item.price for order in orders for item in order.items]
    return sum(prices)


print(total_revenue_of_important_orders([Order(1, [Item("Banana", 6)])]))

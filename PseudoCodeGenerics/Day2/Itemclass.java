// Item class
CLASS Item {
    STRING name
    DOUBLE price

    METHOD Item(n, p) {
        name = n
        price = p
    }
}

// Cart with generic total price method
CLASS Cart {
    LIST<Item> items = []

    METHOD addItem(item) {
        items.add(item)
    }

    GENERIC<T extends Item> METHOD calculateTotalPrice(list) {
        DOUBLE total = 0
        FOR each i IN list
            total = total + i.price
        RETURN total
    }
}

// MAIN
cart = Cart()
cart.addItem(Item("Laptop", 50000))
cart.addItem(Item("Mouse", 500))

PRINT "Total Price: " + cart.calculateTotalPrice(cart.items)

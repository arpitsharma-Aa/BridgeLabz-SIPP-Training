// Customer class
CLASS Customer {
    STRING name
    STRING address
}

// Restaurant class
CLASS Restaurant {
    STRING name
    STRING location
}

// DeliveryBoy class
CLASS DeliveryBoy {
    STRING name
    STRING vehicle
}

// Order class composed of Customer, Restaurant, DeliveryBoy
CLASS Order {
    Customer customer
    Restaurant restaurant
    DeliveryBoy deliveryBoy
    STRING orderDetails

    METHOD Order(cust, rest, delBoy, details) {
        customer = cust
        restaurant = rest
        deliveryBoy = delBoy
        orderDetails = details
    }

    METHOD displayOrder() {
        PRINT "Order for: " + customer.name
        PRINT "From Restaurant: " + restaurant.name
        PRINT "Delivery by: " + deliveryBoy.name
        PRINT "Details: " + orderDetails
    }
}

// MAIN
cust = Customer("Amit", "123 Street")
rest = Restaurant("Foodies", "Downtown")
delBoy = DeliveryBoy("Ravi", "Bike")

order = Order(cust, rest, delBoy, "2 Burgers, 1 Coke")
order.displayOrder()

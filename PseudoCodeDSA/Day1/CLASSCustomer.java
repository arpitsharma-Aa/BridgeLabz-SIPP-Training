CLASS Customer {
    STRING name
    STRING type  // "normal" or "emergency"

    METHOD Customer(n, t) {
        name = n
        type = t
    }
}

CLASS CallCenter {
    QUEUE<Customer> normalQueue
    QUEUE<Customer> emergencyQueue

    METHOD addCustomer(customer) {
        IF customer.type == "emergency"
            emergencyQueue.enqueue(customer)
        ELSE
            normalQueue.enqueue(customer)
    }

    METHOD serveCustomer() {
        IF emergencyQueue NOT empty
            served = emergencyQueue.dequeue()
        ELSE
            served = normalQueue.dequeue()
        
        PRINT "Serving: " + served.name
    }
}

// MAIN
cc = CallCenter()
cc.addCustomer(Customer("Amit", "normal"))
cc.addCustomer(Customer("Priya", "emergency"))
cc.addCustomer(Customer("Ravi", "normal"))

cc.serveCustomer() // Priya first
cc.serveCustomer() // Amit next

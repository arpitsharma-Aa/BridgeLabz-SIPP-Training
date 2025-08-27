// Interface Rentable
INTERFACE Rentable {
    METHOD rent()
}

// Abstract Vehicle class
ABSTRACT CLASS Vehicle IMPLEMENTS Rentable {
    STRING model
    DOUBLE rentPerDay

    METHOD Vehicle(m, r) {
        model = m
        rentPerDay = r
    }
}

// Car class
CLASS Car EXTENDS Vehicle {
    METHOD Car(m, r) {
        SUPER(m, r)
    }

    METHOD rent() {
        PRINT "Renting Car: " + model + " at Rs." + rentPerDay + " per day"
    }
}

// Bike class
CLASS Bike EXTENDS Vehicle {
    METHOD Bike(m, r) {
        SUPER(m, r)
    }

    METHOD rent() {
        PRINT "Renting Bike: " + model + " at Rs." + rentPerDay + " per day"
    }
}

// Truck class
CLASS Truck EXTENDS Vehicle {
    METHOD Truck(m, r) {
        SUPER(m, r)
    }

    METHOD rent() {
        PRINT "Renting Truck: " + model + " at Rs." + rentPerDay + " per day"
    }
}

// Factory Pattern
CLASS VehicleFactory {
    STATIC METHOD getVehicle(type, model, rent) {
        IF type == "car" THEN
            RETURN Car(model, rent)
        ELSE IF type == "bike" THEN
            RETURN Bike(model, rent)
        ELSE IF type == "truck" THEN
            RETURN Truck(model, rent)
        ELSE
            RETURN NULL
        ENDIF
    }
}

// MAIN
car = VehicleFactory.getVehicle("car", "Honda City", 1500)
car.rent()

bike = VehicleFactory.getVehicle("bike", "Royal Enfield", 700)
bike.rent()

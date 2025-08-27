// ENUM for traffic lights
ENUM TrafficLight { RED, GREEN, YELLOW }

// CLASS to handle switching
CLASS TrafficSignal {
    TrafficLight currentLight
    INT intervalSeconds

    // Constructor
    METHOD TrafficSignal(startLight, interval) {
        currentLight = startLight
        intervalSeconds = interval
    }

    // Switch light method
    METHOD switchLight() {
        IF currentLight == RED THEN
            currentLight = GREEN
        ELSE IF currentLight == GREEN THEN
            currentLight = YELLOW
        ELSE IF currentLight == YELLOW THEN
            currentLight = RED
        ENDIF
    }

    // Run simulation
    METHOD run() {
        WHILE TRUE
            PRINT "Current Light: " + currentLight
            WAIT intervalSeconds
            switchLight()
        ENDWHILE
    }
}

// MAIN
CREATE signal = TrafficSignal(RED, 5)
signal.run()

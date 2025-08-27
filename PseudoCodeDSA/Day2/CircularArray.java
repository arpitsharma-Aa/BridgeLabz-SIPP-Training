// Circular Array Timer
CLASS QuizTimer {
    INT[] timeSlots
    INT totalQuestions
    INT currentIndex = 0

    METHOD QuizTimer(slots[]) {
        timeSlots = slots
        totalQuestions = LENGTH(slots)
    }

    METHOD start() {
        FOR i FROM 0 TO totalQuestions-1
            currentIndex = i % totalQuestions
            PRINT "Time for Question " + (i+1) + " : " + timeSlots[currentIndex] + " seconds"
            
            IF timeSlots[currentIndex] <= 5 THEN
                PRINT "Warning! Only few seconds left."
            ENDIF
        ENDFOR
    }
}

// MAIN
CREATE slots = [30, 45, 60]   // seconds for each question
CREATE timer = QuizTimer(slots)
timer.start()

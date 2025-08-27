MAP<String, Integer> studentMarks

studentMarks.put("Amit", 85)
studentMarks.put("Priya", 92)
studentMarks.put("Ravi", 78)

// Using streams to find highest scorer
highest = studentMarks.entrySet()
                       .stream()
                       .max(byValue)
                       .get()

PRINT "Highest Scorer: " + highest.key + " with marks " + highest.value

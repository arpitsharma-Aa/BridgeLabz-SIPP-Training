// Flight class
CLASS Flight {
    STRING flightID
    DOUBLE price
    INT duration   // in minutes
}

// Custom Comparator: sort by price first, then duration
FUNCTION compare(f1, f2) {
    IF f1.price != f2.price
        RETURN f1.price - f2.price
    ELSE
        RETURN f1.duration - f2.duration
}

// Merge Sort
METHOD mergeSort(flights[], left, right) {
    IF left < right THEN
        mid = (left + right) / 2
        mergeSort(flights, left, mid)
        mergeSort(flights, mid+1, right)
        merge(flights, left, mid, right)
    ENDIF
}

METHOD merge(flights[], left, mid, right) {
    CREATE temp[]
    i = left, j = mid+1

    WHILE i <= mid AND j <= right
        IF compare(flights[i], flights[j]) <= 0
            temp.add(flights[i])
            i++
        ELSE
            temp.add(flights[j])
            j++
    ENDWHILE

    COPY remaining elements
    COPY temp[] back into flights[left..right]
}

// MAIN
flights = [
    Flight("F1", 5000, 180),
    Flight("F2", 4500, 200),
    Flight("F3", 5000, 150)
]

mergeSort(flights, 0, LENGTH(flights)-1)

FOR each f IN flights
    PRINT f.flightID + " " + f.price + " " + f.duration

// Course class
CLASS Course {
    STRING name
}

// Student class
CLASS Student {
    STRING name
}

// Registration system
CLASS Registration {
    MAP<Course, LIST<Student>> courseMap

    METHOD register(course, student) {
        IF courseMap[course] DOES NOT EXIST
            courseMap[course] = []
        ENDIF
        courseMap[course].add(student)
    }

    METHOD display() {
        FOR each entry IN courseMap
            PRINT "Course: " + entry.key.name
            FOR each student IN entry.value
                PRINT " - " + student.name
    }
}

// MAIN
c1 = Course("Math")
c2 = Course("Physics")

s1 = Student("Amit")
s2 = Student("Priya")
s3 = Student("Ravi")

reg = Registration()
reg.register(c1, s1)
reg.register(c1, s2)
reg.register(c2, s3)

reg.display()

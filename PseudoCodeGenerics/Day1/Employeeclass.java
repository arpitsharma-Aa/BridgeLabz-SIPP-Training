// Employee class
CLASS Employee {
    STRING name
    STRING department

    METHOD Employee(n, d) {
        name = n
        department = d
    }
}

LIST<Employee> employees

employees.add(Employee("Amit", "IT"))
employees.add(Employee("Priya", "HR"))
employees.add(Employee("Ravi", "IT"))

// Filter by department using streams
itEmployees = employees.stream()
                        .filter(emp -> emp.department == "IT")
                        .collect(toList())

FOR each emp IN itEmployees
    PRINT emp.name

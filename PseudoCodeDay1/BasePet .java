// Base Pet class
CLASS Pet {
    STRING name
    INT age

    METHOD Pet(n, a) {
        name = n
        age = a
    }

    METHOD displayInfo() {
        PRINT "Name: " + name + ", Age: " + age
    }
}

// Dog class
CLASS Dog EXTENDS Pet {
    STRING breed

    METHOD Dog(n, a, b) {
        SUPER(n, a)
        breed = b
    }

    METHOD displayInfo() {
        SUPER.displayInfo()
        PRINT "Breed: " + breed
    }
}

// Cat class
CLASS Cat EXTENDS Pet {
    STRING color

    METHOD Cat(n, a, c) {
        SUPER(n, a)
        color = c
    }

    METHOD displayInfo() {
        SUPER.displayInfo()
        PRINT "Color: " + color
    }
}

// Bird class
CLASS Bird EXTENDS Pet {
    STRING species

    METHOD Bird(n, a, s) {
        SUPER(n, a)
        species = s
    }

    METHOD displayInfo() {
        SUPER.displayInfo()
        PRINT "Species: " + species
    }
}

// MAIN
dog = Dog("Tommy", 3, "Labrador")
cat = Cat("Kitty", 2, "White")
bird = Bird("Mittu", 1, "Parrot")

dog.displayInfo()
cat.displayInfo()
bird.displayInfo()

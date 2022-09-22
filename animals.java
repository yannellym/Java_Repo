// You should have:

// A parent class named Animal.

// Inside it define:
// name
// age
// set_value(int a,string b):
// sets age and name parameters and to the given values.
// default constructor
// Then there are two derived classes

// Zebra
// Dolphin
// The derived classes should

// Return a string containing a message telling the age and the name as well as information about place of origin of that animal.
// Hint: You have to create two separate message functions for both the base classes.
// Hint: The origin of Zebra is Africa, and the origin of Dolphin is New Zealand.
// Example#
// The animal_type named name is age years old. The animal_type comes from origin.

// If we have an animal of class Zebra, whose name is Z with age, 2 and the country name Africa

class Animal {
    private int age;
    private String name;

    void set_data(int a, String b) {
        age = a;
        name = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Zebra extends Animal {

    String message_zebra(String str) {
        str = "The zebra named " + getName() + " is " + getAge() + " years old. The zebra comes from Africa";
        return str;
    }
}

class Dolphin extends Animal {


    String message_dolphin(String str) {
        str = "The dolphin named " + getName() + " is " + getAge() + " years old. The dolphin comes from New Zealand";
        return str;
    }
}

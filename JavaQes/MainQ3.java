package JavaQes;

/*  Define an abstract class Shape with abstract methods area () and volume (). Derive
abstract class Shape into two classes Cone and Cylinder. Write a java Program to
calculate area and volume of Cone and Cylinder.(Use Super Keyword.) */

abstract class Shape {

    double radius, height;

    // Constructor
    Shape(double radius, double height) {

        this.radius = radius;
        this.height = height;
    }

    // Abstract methods
    abstract void area();

    abstract void volume();
}

// Cone class
class Cone extends Shape {

    Cone(double radius, double height) {

        super(radius, height); // using super keyword
    }

    void area() {

        // Slant height
        double l = Math.sqrt(radius * radius + height * height);

        double area = 3.14 * radius * (radius + l);

        System.out.println("Area of Cone = " + area);
    }

    void volume() {

        double volume = (1.0 / 3) * 3.14 * radius * radius * height;

        System.out.println("Volume of Cone = " + volume);
    }
}

// Cylinder class
class Cylinder extends Shape {

    Cylinder(double radius, double height) {

        super(radius, height); // using super keyword
    }

    void area() {

        double area = 2 * 3.14 * radius * (radius + height);

        System.out.println("Area of Cylinder = " + area);
    }

    void volume() {

        double volume = 3.14 * radius * radius * height;

        System.out.println("Volume of Cylinder = " + volume);
    }
}

// Main class
public class MainQ3 {

    public static void main(String[] args) {

        Cone c = new Cone(5, 10);

        Cylinder cy = new Cylinder(5, 10);

        c.area();
        c.volume();

        cy.area();
        cy.volume();
    }
}
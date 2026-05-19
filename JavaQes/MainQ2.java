package JavaQes;


/*  Define an Interface Shape with abstract method area(). Write a java program to
calculate an area of Circle and Sphere.(use final keyword) */


interface Shape {

    // Abstract method
    void area();
}

// Circle class
class Circle implements Shape {

    final double PI = 3.14;
    int radius = 5;

    public void area() {

        double area = PI * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}

// Sphere class
class Sphere implements Shape {

    final double PI = 3.14;
    int radius = 5;

    public void area() {

        double area = 4 * PI * radius * radius;

        System.out.println("Area of Sphere = " + area);
    }
}

// Main class
public class MainQ2 {

    public static void main(String[] args) {

        Circle c = new Circle();
        Sphere s = new Sphere();

        c.area();
        s.area();
    }
}
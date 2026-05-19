package JavaQes;

/* Create an abstract class Shape with methods calc_area() &amp;amp;
 calc_volume(). Derive two classes Sphere(radius)&amp;amp; 
 Cone(radius, height) from it. Calculate area and
  volume of both.(Use Method Overriding) */

 abstract class Shape {

    // Abstract methods
    abstract void calc_area();

    abstract void calc_volume();
}

// Sphere class
class Sphere extends Shape {

    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    // Method Overriding
    void calc_area() {

        double area = 4 * 3.14 * radius * radius;

        System.out.println("Area of Sphere = " + area);
    }

    // Method Overriding
    void calc_volume() {

        double volume = (4.0 / 3) * 3.14 * radius * radius * radius;

        System.out.println("Volume of Sphere = " + volume);
    }
}

// Cone class
class Cone extends Shape {

    double radius, height;

    Cone(double radius, double height) {

        this.radius = radius;
        this.height = height;
    }

    // Method Overriding
    void calc_area() {

        double area = 3.14 * radius * (radius + height);

        System.out.println("Area of Cone = " + area);
    }

    // Method Overriding
    void calc_volume() {

        double volume = (1.0 / 3) * 3.14 * radius * radius * height;

        System.out.println("Volume of Cone = " + volume);
    }
}

// Main class
public class MainQ4{

    public static void main(String[] args) {

        Sphere s = new Sphere(5);

        Cone c = new Cone(5, 10);

        s.calc_area();
        s.calc_volume();

        c.calc_area();
        c.calc_volume();
    }
} 
import org.w3c.dom.Text;

/**
 * Assignment
 */
class Display {
    public void Print() {
        System.out.println("Display Area");// Base Class or Parent Class
    }
}

class Area extends Display {
    public void show(int h, int n) {
        System.out.println(0.5 * n * h + " Area of School");
    }// inherites base class
}

class Circle extends Display {
    int g = 10;

    public void round(int r) {
        System.out.println((3.14) * r * r + " Area of Circle");
    }// This Also inhertes base class
}

class Square extends Circle {
    public void sqr(int n) {
        System.out.println(n * n + " The Area of the Square");
    }// This inherites the Display Class
}

public class Assignment {

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.sqr(8);
    }
}
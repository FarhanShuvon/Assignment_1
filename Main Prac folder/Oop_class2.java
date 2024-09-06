class Person {
    int salary;
    String name;

    Person() {
        System.out.println("Default Constructor");
    }

    Person(int salary, String name) {
        this.salary = salary;
        this.name = name;
        // System.out.println(salary + " " + name);
       // printinfo();
    }

    void printinfo() {
        System.out.println(salary + " " + name);
    }

}

public class Oop_class2 {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.salary = 56;
        s1.name = "Shuvon";
        Person s2 = new Person(5, "Shuvon");
       // printinfo();
        s2.printinfo();
    }
}

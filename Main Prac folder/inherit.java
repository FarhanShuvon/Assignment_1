import javax.security.auth.login.AccountException;

//import Bank;
class Display {
    public void Print() {
        System.out.print("Display Area : ");
    }
}

class Area extends Display {
    void show(int l, int h) {
        int g = (l * h);
        System.out.println(0.5 * l * h);
    }
}

class All extends Area {
    void Print(int n) {
        System.out.println("The Area needed is : " + n);
    }
}

public class inherit {
    public static void main(String[] args) {
        All s1 = new All();
        s1.Print();
        s1.show(9, 12);
        s1.Print(8);
        //s1.show(8, 12);
    }
}

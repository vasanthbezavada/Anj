package oops.play;

class Parent {
    public int a = 10;
    public int b = 20;

    public void printer() {
        System.out.println("values : " + this.a + " " + this.b);
    }
    public void bPrinter(){
        System.out.println("value of b is : "+ b);
    }
}
class Child extends Parent {
    public int b = 30;
    public int c = 40;

    public void printer() {
        System.out.println("values : " + this.a + " " + this.b + " " + this.c);
    }
    public void childbPrinter(){
        System.out.println("value of b in child  : "+ b);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Parent p = new Parent(); // 10 20
        Parent p1 = new Child(); // 10 20 40 // error
        Child c = new Child(); // error
        p.printer();
        p1.printer();
        c.printer();
/*        Child c2 = (Child) new Parent();
        c2.printer();*/
        p.bPrinter();
        p1.bPrinter();
        c.bPrinter();
    }
}

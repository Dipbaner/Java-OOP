class A {
    public static void show(){
        System.out.println("In show of A");
    }
}
// method Hiding
class B extends A {
    public static void show(){
        System.out.println("In Show of B");
    }
}
public class NewDemo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

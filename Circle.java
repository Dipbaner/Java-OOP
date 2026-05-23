public class Circle {
    private int radius;
    private final double pi; // must be initialized

    public Circle(int radius){
        this.radius = radius;
        pi = 3.14;
    }
    public Circle(){
        pi = 4.15;
    }
    public void show(){
        System.out.println("Radius is :- "+radius);
        System.out.println("PI is :- "+pi);
    }
}

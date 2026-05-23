public class UseShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(10);
        s.area(7.0);
        s.area(5, 7);
        s.area('A');    // type promotion
    }
}

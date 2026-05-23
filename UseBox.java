public class UseBox {
    public static void main(String args[]){
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(100, 100, 100);
        b1.show();
        b2.show();
        b3.show();

        Box1 a1 = new Box1();
        Box1 a2 = new Box1(10);
        Box1 a3 = new Box1(100, 100, 100);
        a1.show();
        a2.show();
        a3.show();

    }
}

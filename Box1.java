public class Box1 {
    private int length, breadth, height;

    public Box1(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public Box1(int side){
        this(side, side, side);
    }
    public Box1(){
        this(0, 0, 0);
    }
    public void show(){
        System.out.println("Length :- "+length+" Breadth :- "+breadth+" Height :- "+height);
    }
}

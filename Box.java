public class Box {
    private int length, breadth, height;

    public Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public Box(int side){
        length = side;
        breadth = side;
        height = side;
    }
    public Box(){
        length = 0;
        breadth = 0;
        height = 0;
    }
    public void show(){
        System.out.println("Length :- "+length+" Breadth :- "+breadth+" Height :- "+height);
    }
}

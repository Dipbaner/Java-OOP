class Data {
    static {
        System.out.println("First Static Block Executed");
    }
    static {
        System.out.println("Second static block executed");
    }
    public Data() {
        System.out.println("Constructor Called");
    }   
}

public class UseData {
    public static void main(String[] args) {
        Data d = new Data();
        Data d1 = new Data();
        Data d2 = new Data();
    }
}

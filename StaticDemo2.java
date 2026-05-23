class Employee {

    private int age;
    private String name;
    private static String company = "Amazon";  // Not Change further

    public Employee(int age, String name){
        this.name = name;
        this.age = age;
    } 
    public void show(){
        System.out.println("Name :- "+name+" Age :- "+age+" Company : "+company);
    }    
}
public class StaticDemo2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(30, "Amit");
        Employee emp2 = new Employee(40, "Anmol");
        Employee emp3 = new Employee(50, "Ajay");
        emp1.show();
        emp2.show();
        emp3.show();
    }   
}

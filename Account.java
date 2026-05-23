import java.util.Scanner;

public class Account {
    private int accountId;
    private String name;
    private double balance;
    private static double rateOfIntrest;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate of Intrest :- ");
        rateOfIntrest = sc.nextDouble();
    }
    public Account(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }
    public void show(){
        System.out.println("Account Id :- "+accountId);
        System.out.println("Name :- "+name);
        System.out.println("Balance :- "+balance);
        System.out.println("Rate of Intrest :- "+rateOfIntrest);
    }
    
}

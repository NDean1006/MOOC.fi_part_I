
public class Accounts {

    public static void main(String[] args) {
        Account test = new Account("Matt's account", 1000.0);
        Account my = new Account("My account", 0.0);
        test.withdrawal(100);
        my.deposit(100);
        System.out.println(test.toString());
        System.out.println(my.toString());
    }
}
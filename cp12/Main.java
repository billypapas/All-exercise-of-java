package gr.aueb.cf.cp12;

public class Main {
    public static void main(String[] args) {
        User bill = new User(1234567890L, "Bill", "Papagiannis" );
        UserCridentials userBill = new UserCridentials(bill.id, "bill@gmail.com", "qwerty");
        System.out.println("Print User details:");
        System.out.println("User ID: " + bill.getId());
        System.out.println("User firstname: " + bill.getFirstname());
        System.out.println("User lastname: " + bill.getLastname());
        System.out.println();
        System.out.println("Print User Credentials details:");
        System.out.println("User ID: " + userBill.getId());
        System.out.println("User username: " + userBill.getUsername());
        System.out.println("User password: " + userBill.getPassword());

    }
}

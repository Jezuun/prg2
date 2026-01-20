public class Main {
    public static void main(String[] args){
    account acc1 = new account(420, "jesse" , 8000);
    account acc2 = new account (78, "ren", 20);

   // calling deposit
    acc2.deposit(2000);
    acc1.withdraw(500);

    acc1.calculateInterest();
    acc2.calculateInterest();

    System.out.println(acc1);
    System.out.println(acc2);

    System.out.println("Total number of accounts created : " + account.getNumberOfAccounts());
//calling equals and allowing it to print wheather true or false
    System.out.println(acc1.equals(acc2));
    }

}




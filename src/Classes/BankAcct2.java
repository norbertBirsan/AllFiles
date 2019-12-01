package Classes;

public class BankAcct2 {
    public static void main(String[] args) {
       BankAcct a1 = new BankAcct();
       a1.type = "Business";
        a1.acctN = 21001843002l;
        a1.balance = 2918;
        a1.holderName = "Norbert Birsan";

        a1.info();
        a1.deposit(5000);
        a1.info();
        a1.transfer(82);
        a1.info();

    }
}

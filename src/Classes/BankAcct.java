package Classes;

public class BankAcct {
    String type;
    long acctN;
    double balance;
    String holderName;

    public void deposit(double amount){
        System.out.println(amount + " is deposited to your account");
        this.balance+=amount;
    }
    public void transfer(double amount){
        if(this.balance<=amount){
            System.out.println(amount + " $ is transferred from your");
            balance-=amount;


        }else{
            System.out.println(" not enough funds");
        }

    }
      public void info(){
          System.out.println("Name: " + this.holderName);
          System.out.println("Balance: "+ this.balance);
          System.out.println("Type: "+ this.type);
          System.out.println("Account number: " + this.acctN);
      }

    }

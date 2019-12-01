package Constructors;

public class PhoneTest{
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone X","Gold");
        phone.info();
        phone.memory = 45;
        phone.info();
        Phone samsung = new Phone ("Samsung Galaxy", "Black", -1, true);
        samsung.info();
        System.out.println("--------");

        boolean result = samsung.text(1233321456, "What's up");
        System.out.println(result);

        phone.call(31234254L);
    }
}

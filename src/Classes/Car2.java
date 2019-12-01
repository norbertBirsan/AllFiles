package Classes;

public class Car2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Volvo";
        c1.year = 2019;
        c1.mileage = 10000;
        c1.sportEdition = true;

        System.out.println(c1.mileage);
        c1.drive("Downtown");
        System.out.println(c1.mileage);
        c1.drive(213);
        System.out.println(c1.mileage);

    }
    String make;
    int year;
    boolean sportEdition;
    int mileage;

    public void drive(){
        System.out.println(year + " " + make + " is driving.");
        mileage +=10;



    }
    public void drive(String destination){
        System.out.println(this.year + " " + this.make + " is driving to " + destination);
        this.mileage+=10;

    }
    public void drive(int miles ){
        System.out.println(this.year + " " + this.make + " is driving " + miles);
        this.mileage= miles;
    }
}





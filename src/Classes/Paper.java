package Classes;

public class Paper {
    public static void main(String[] args) {



        Flag f1 = new Flag();
        Flag f2 = new Flag();
        f1.country = "America";
        f1.color = "Red white Red" ;
        f1.size = 345;
        f1.material = "paper";




       f2.country=f1.country;
       f2.color = f1. color;
       f2.size = f1.size;
       f2.material = f1.material;


        f1.country = "dschibutti";
        f1.color = "blue white blue" ;
        f1.size = 545;
        f1.material = "plastic" ;
    f1.info();
    f2.info();


       f1.upgrade(255, "gold");
       f1.info();


    }
}
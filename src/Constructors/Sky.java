package Constructors;

public class Sky { //datatype

    public Sky(String colorCode){
        this.color = colorCode;


    }public Sky(String color, int visibleStars){
        this.color = color;//left color reffers to string color below.right one reffers to value
        this.visibleStars = visibleStars;

    }
    String color;
    int visibleStars;

    public void info(){
        System.out.println("\nColor: " + color);
        System.out.println("Visible stars: " + this.visibleStars);
    }


    public static void main(String[] args) {//shoul not create main method here, but this is only for now to show
        Sky refferencesky = new Sky("Blue");
        System.out.println(refferencesky.color);

        Sky s2 = new Sky("Yellow", 7);
        s2.info();
        refferencesky.info();




        //reference name left and object to right, on right is also the constructor which has to have same name ass class name
        //every method has return type like void, but this just looks like a method, buuuut is nooooot
    }
}

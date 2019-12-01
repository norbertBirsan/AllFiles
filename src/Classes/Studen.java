package Classes;

public class Studen {

    String name;
    String email;
    int age;

    public Studen(String name) {
        this.name = name;
    }

    public void read(){
        System.out.println(name + " is reading");

    }
    public void read(int hours){
        System.out.println(name + " is reading for " + hours);

    }
    public void read(Book book) {
        System.out.println(name + " is reading " + book.title);

    }


}

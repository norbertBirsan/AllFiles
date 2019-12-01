package staticExamples;

public class Tea {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        m1.color = "White";//wrote just optionally.not mandatory. we have the object but we don't know for instance
        //what color is or the size...i don't know anything abt object but object is there. like facebook without profile
        //picture or info
        //constructor is there to set information of an object

        //if i put print out m2.color, it gives me null
        System.out.println(m2.color);

        Mouse m3 = m2;//not an object, just a reference. before we assign m2 ad
        //this is like doing this to not loose a value.
        //int i = 5;
        //int j = i;
        //int i = 7;


        //if i print m1 or m2 . i will see adress of object
        //now if i say m2 = m1.
        m2= m1;
        //what ever we have in m1 is going to be put in m2
        //now m2 and m1 both have m1 adress. both point to m1
        //if i do
        m2.color = "Black";//instead of "white"
        System.out.println(m1.color);

        Mouse m4 = new Mouse("Grey", 23, true); //here i created an object that has information right away.

    }
}

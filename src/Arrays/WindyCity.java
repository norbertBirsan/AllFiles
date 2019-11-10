//Write a program and create String array called cities. Initialize the cities with cities below:
//        WindyCity, New York, Madison, Miami, Washington
//        Iterate through each city and check if WindyCity is inside the cities.
//        Print "Windy city found" if WindyCity exists in the array. "Windy city not found" otherwise.

        package Arrays;

public class WindyCity {
        public static void main(String[] args) {
                //WindyCity, New York, Madison, Miami, Washington
                String [] cities = { "New York", "Madison","WindyCity", "Miami", "Washington", "WindyCity"};
                boolean check = false;
                int count = 0;
                for(String city: cities) {
                        if(city.equalsIgnoreCase("WindyCity")) {
                                check = true;
                                count++;
                        }
                }
                if(check) {
                        System.out.println("Windy city found " + count + " times");
                } else {
                        System.out.println("Windy city not found");
                }

        }
}

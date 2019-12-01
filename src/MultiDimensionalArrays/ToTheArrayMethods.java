package MultiDimensionalArrays;

public class ToTheArrayMethods {
   // int [][] arr = {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}};

    public static int indexOfBiggestSumArray(int [][] twoDarray) {

        int index = 0;
        int biggest = 0;

        for(int i=0; i < twoDarray.length; i++) {
            int sum = 0;

            for(int j=0; j <twoDarray[i].length; j++) {
                sum += twoDarray[i][j];
            }

            if(sum > biggest) {
                biggest = sum;
                index = i;
            }

        }

        return index;

    }


    public static int biggestNumberFrom2DArray(int [][] twoDarr) {

        int biggest = twoDarr[0][0];

        for(int i=0; i < twoDarr.length; i++) {

            for(int j = 0; j < twoDarr[i].length; j++) {

                if(twoDarr[i][j] > biggest) {
                    biggest = twoDarr[i][j];
                }

            }

        }

        return biggest;
}
}

//    Sample values: {{3,5,2,342,4,23},{43,32,4032,32,43},{43,43,23,23}}
//        ——————
//        Create a method that will return the biggest numbers from a 2D array
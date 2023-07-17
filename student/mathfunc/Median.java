package student.mathfunc;

import java.util.ArrayList;

public class Median {
    public static double getMedian(ArrayList<Double> doubleArrayList) {
    
        doubleArrayList.sort((n1, n2) -> (int) (n1 - n2));
        if (doubleArrayList.size() % 2 == 0 && doubleArrayList.size() !=0 ) {
            double median = (doubleArrayList.get(doubleArrayList.size() / 2 - 1) + doubleArrayList.get(doubleArrayList.size() / 2)) / 2;
            return median;
        } else {
           return doubleArrayList.get(doubleArrayList.size() / 2);
        }
    }
}

package student.mathfunc;

import java.util.ArrayList;

public class Average {
    public static double getAverage(ArrayList<Double> doubleArrayList) {
        double average =  doubleArrayList.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        return average;
    }
}

package student.mathfunc;

import java.util.ArrayList;

public class StandardDeviation {
    public static double getStandardDeviation(ArrayList<Double> doubleArrayList) {
        double average = doubleArrayList.stream()
                .mapToInt(Double::intValue)
                .average()
                .orElse(0.0);

        double n = doubleArrayList.size();
        double sumOfSquaredDifferences = 0;

        for (Double i : doubleArrayList) {
            double difference = i - average;
            sumOfSquaredDifferences += difference * difference;
        }

        double variance = sumOfSquaredDifferences / n;
        return variance;
    }
}

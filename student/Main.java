package student;

import student.mathfunc.Average;
import student.mathfunc.Median;
import student.mathfunc.StandardDeviation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        try {
            while (scanner.hasNext()) {
                double num = Double.parseDouble(scanner.nextLine());

                if (isWithinRange(num, doubleArrayList)) {
                    doubleArrayList.add(num);
                }

                double average = Average.getAverage(doubleArrayList);
                double median = Median.getMedian(doubleArrayList);
                double standardDeviation = StandardDeviation.getStandardDeviation(doubleArrayList);


                int rangeDown = calculateRangeDown(average, median, standardDeviation);
                int rangeUp = calculateRangeUp(average, median, standardDeviation);

                System.out.println(rangeDown + " " + rangeUp);
            }
            scanner.close();
        } catch (NumberFormatException exception) {
            System.out.println("Input contains illegal symbols");
        }
    }

    private static boolean isWithinRange(double num, ArrayList<Double> doubleArrayList) {
        double average = Average.getAverage(doubleArrayList);
        double deviation = 200;

        return num > average - deviation && num < average + deviation;
    }

    private static int calculateRangeDown(double average, double median, double standardDeviation) {
        return (int) Math.round((average + median) / 2.0 - standardDeviation * 0.055);
    }

    private static int calculateRangeUp(double average, double median, double standardDeviation) {
        return (int) Math.round((average + median) / 2.0 + standardDeviation * 0.055);
    }
}

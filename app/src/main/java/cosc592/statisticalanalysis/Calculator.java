package cosc592.statisticalanalysis;

import android.util.Log;

import java.util.Arrays;

public class Calculator {

    public static double Stdv(String number3) {
        int sum = 0 ;
        double sum2 = 0.0;
        char[] array3 = number3.toCharArray();
        for (int i = 0; i < array3.length; i++) {
            sum += Character.getNumericValue(array3[i])/array3.length;
        }
        for (int i = 0; i < array3.length; i++) {
            sum2 +=Math.pow(i - sum, 2) ;
        }
        double x = Math.sqrt(sum2 / array3.length);
        return x ; }

    public static double Median(String number3) {
     double median;
        char[] numArray = number3.toCharArray();
        double arr[] = new double[numArray.length];

        for (int i = 0; i < numArray.length; i++) {
            arr[i] = Character.getNumericValue(numArray[i]); }
        Arrays.sort(arr);
        int middle = ((arr.length) / 2);
        if (arr.length % 2 == 0) {
            double medianA = arr[middle];
            double medianB = arr[middle - 1];
            median = (medianA + medianB) / 2;
        } else {
            median = arr[middle];
        }
        return  median ; }
        public static int Max(String number) {
        int max, min;
        char[] array = number.toCharArray();
        max = min = Character.getNumericValue(array[0]);
        for (int i = 0; i < array.length; i++) {
        int value = Character.getNumericValue(array[i]);
        if (max < value)
        max = value;
        if (min > value)
        min = value; }
        return max ; }

    public static int Min(String number2) {
        int max, min;
       char[] array2 = number2.toCharArray();
       max = min = Character.getNumericValue(array2[0]);
       for (int i = 0; i < array2.length; i++) {
       int value = Character.getNumericValue(array2[i]);
       if (max < value)
       max = value;
       if (min > value)
       min = value; }
        return  min ;}

    public static int Sum( String number3 ) {
        int sum = 0;
        char[] array3 = number3.toCharArray();
        for (int i = 0; i < array3.length; i++) {
        sum += Character.getNumericValue(array3[i]); }
        return sum ; }

    public static double  Mean(String number4) {
        int median = 0;
        char[] array4 = number4.toCharArray();
        for (int i = 0; i < array4.length; i++) {
        median += Character.getNumericValue(array4[i]); }
        double median2 = median / array4.length;
        return  median2 ; }}



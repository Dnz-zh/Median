package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[] mamba = {13, 8, 15, 5, 17};

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        final double mediana;
        if(array.length % 2 == 0)
            mediana = ((double)array[array.length/2]+ (double)array[array.length/2 -1])/2;
        else
            mediana = (double) array[array.length/2];

        Arrays.sort(array, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) return 0;
                if (Math.abs(Double.parseDouble(o1.toString()) - mediana) - Math.abs(Double.parseDouble(o2.toString()) - mediana) > 0) {
                    return 1;
                }
                else if (Math.abs(Double.parseDouble(o1.toString()) - mediana) - Math.abs(Double.parseDouble(o2.toString()) - mediana) < 0) {
                    return -1;
                }
                else return 0;





            }
        });




        return array;
    }
}

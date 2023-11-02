package com.solvd.laba.block1.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        SelectionSort selectionSort = new SelectionSort();
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        selectionSort.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

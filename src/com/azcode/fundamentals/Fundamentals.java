package com.azcode.fundamentals;

import com.azcode.fundamentals.algorithm.BinarySearch;
import com.azcode.fundamentals.algorithm.BubbleSort;
import com.azcode.fundamentals.algorithm.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fundamentals {
    public static void main(String[] args) {

        // Algorithm calls
        String algorithmName;

        Recursive.loop(5);
        Recursive.drawRectangle(5);
        System.out.println(Recursive.collatz(3));
        System.out.println(Recursive.factor(8));

        Integer[] arr = {8, 1, 7, 5, 9, 2};
        List<Integer> l = new ArrayList<>(Arrays.asList(arr));
        BubbleSort.sort(l);

        algorithmName = "Bubble Sort: ";
        Integer arr2[] = {3, 2, 1, 6, 8, 9};
        List<Integer> l2 = new ArrayList(Arrays.asList(arr2));
        int ele = 2;
        if (BinarySearch.searchElement(l2, ele))
            System.out.println(algorithmName.concat("Element found."));
        else
            System.out.println(algorithmName.concat("Element not found."));

    }
}

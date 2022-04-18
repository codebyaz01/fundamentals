package com.azcode.fundamentals.algorithm;

import java.util.List;

public class BubbleSort {
    public static List<Integer> sort(List<Integer> l) {

        int n = l.size();
        int swap = -1;

        while (swap != 0) {

            swap = 0;

            for (int i = 0; i < n - 1; i++) {

                int val = l.get(i);
                int nextVal = l.get(i + 1);

                if (val > nextVal) {
                    l.set(i + 1, val);
                    l.set(i, nextVal);
                    swap++;
                }
            }

            n --;
        }

        return l;
    }


}

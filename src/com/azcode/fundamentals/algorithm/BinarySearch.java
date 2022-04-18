package com.azcode.fundamentals.algorithm;

import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static boolean searchElement(List<Integer> l, int ele) {

        int n = l.size();
        Collections.sort(l);

        int midPosition = (n - 1) / 2;

        int end = n - 1;
        for (int start = 0; end > -1;) {

            if (l.get(midPosition) == ele)
                return true;

            if (ele > l.get(midPosition))
                start = midPosition + 1;
            else
                end = midPosition - 1;

            midPosition = (start + end) / 2;
        }

        return false;
    }
}

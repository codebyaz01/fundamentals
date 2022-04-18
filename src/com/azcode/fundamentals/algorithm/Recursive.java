package com.azcode.fundamentals.algorithm;

public class Recursive {

    public static int collatz(int n) {
        if (n == 1)
            return 0;
        else if (n % 2 == 0)
            return 1 + collatz(n / 2);

        return 1 + collatz(3 * n + 1);
    }

    public static int factor(int n) {

        if (n == 1)
            return 1;

        int r = n * factor(n - 1);
        return r;
    }

    public static void loop(int n) {
        if (n == 0)
            return;

        loop(n - 1);

        System.out.println(n);
    }

    public static void drawRectangle(int h) {

        if (h <= 0)
            return;

        drawRectangle(h - 1);

        for (int i = 0; i < h; i ++) {
            System.out.print("#");
        }
        System.out.println();
    }

}

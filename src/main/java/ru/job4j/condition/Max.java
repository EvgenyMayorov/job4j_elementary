package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(max(a, b), c), d);
    }

    public static void main(String[] args) {
        int res = Max.max(3, 6);
        System.out.println(res);
        res = Max.max(8, 8, 20);
        System.out.println(res);
        res = Max.max(89, 15, 8, 99);
        System.out.println(res);
    }
}

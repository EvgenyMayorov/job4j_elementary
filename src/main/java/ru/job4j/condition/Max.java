package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int res = Max.max(3, 6);
        System.out.println(res);
        res = Max.max(8, 8);
        System.out.println(res);
        res = Max.max(89, 15);
        System.out.println(res);
    }
}

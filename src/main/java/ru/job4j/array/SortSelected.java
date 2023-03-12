package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int iteration = 0; iteration < data.length; iteration++) {
            int min = MinDiapason.findMin(data, iteration, data.length - 1);
            int index = FindLoop.indexInRange(data, min, iteration, data.length - 1);
            SwitchArray.swap(data, iteration, index);
        }
        return data;
    }
}

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] array = {5,10,23,1,-3};
        System.out.println("Исходный массив:      " + Arrays.toString(array));
        HeapSort.sort(array); // сортируем
        System.out.println("Сортированный массив: " + Arrays.toString(array));
    }
}

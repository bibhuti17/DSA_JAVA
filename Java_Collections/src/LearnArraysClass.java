import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println(index);
        Arrays.sort(numbers); //applies quick sort
//        Arrays.parallelSort(numbers);  for multi-processor systems
        Arrays.fill(numbers, 9);
        System.out.println(numbers);


    }
}

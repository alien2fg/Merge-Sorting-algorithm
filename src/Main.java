import java.util.Scanner;

public class Main {

    private static int[] tempArray;

    public static void Merge_Sort(int[] numbers, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            Merge_Sort(numbers, start, middle);
            Merge_Sort(numbers, middle + 1, end);
            Merge(numbers, start, middle, end);
        }
    }

    public static void Merge(int[] numbers, int start, int middle, int end) {

        System.arraycopy(numbers, start, tempArray, start, end - start + 1);

        int i = start;
        int j = middle + 1;
        int k = start;

        while (i <= middle && j <= end) {
            if (tempArray[i] <= tempArray[j]) {
                numbers[k] = tempArray[i];
                i++;
            } else {
                numbers[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            numbers[k] = tempArray[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of elements to be sorted.");
        int quantity = myObj.nextInt();
        int[] numbers = new int[quantity];
        tempArray = new int[quantity];
        System.out.println("Please enter an array of numbers to be sorted");
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Please enter %d number: %n", i + 1);
            numbers[i] = myObj.nextInt();
        }

        System.out.println("\nContent of the array before sorting: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        //Sorting
        Merge_Sort(numbers, 0, quantity - 1);

        System.out.println("\nContent of the array after sorting: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
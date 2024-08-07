import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of elements to be sorted.");
        int quantity = myObj.nextInt();
        int[] numbers = new int[quantity];
        System.out.println("Please enter an array of numbers to be sorted");
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Please enter %d number: %n", i+1);
            numbers[i]=myObj.nextInt();
        }



        System.out.println("\nContent of the array before sorting: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nContent of the array after sorting: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
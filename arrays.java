import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int marks[] = new int[3];

        // int marks[] = {97,98,99};

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a value: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }
}
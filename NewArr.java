import java.util.Scanner;

public class NewArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int num : arr) {
            System.out.print(num + " ");
        }

        // System.out.println(Arrays.toString(arr)); - supposed to print the array by
        // converting it into a string - not working :(

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
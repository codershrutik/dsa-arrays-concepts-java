public class MultidimensionalArr{
    public static void main(Strin[] args){

        int[][] arr = new int[3][];

        int[][] arr = {
            {1,2,3},
            {4,5,6}.
            {7,8,9}
        }

        // input
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");
            }
        }        

    }
}
import java.util.ArrayList;

public class ArrayList{

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(57);
        list.add(47);
        list.add(37);
        list.add(27);
        list.add(17);
        list.add(7);

        System.out.println(list);

        //user input and output

        //input
         for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
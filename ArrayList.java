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
    }
}
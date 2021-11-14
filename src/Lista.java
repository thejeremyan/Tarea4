import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static List<Integer> integers = new ArrayList<Integer>();

    public static void addInteger(Integer value) throws IllegalArgumentException {
        if (integers.contains(value)) {
            throw new IllegalArgumentException("Integer already added.");
        }
        integers.add(value);
    }
    public static void print(){
        for(int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i)+ " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        try {
            addInteger(1);
            print();
            addInteger(2);
            print();
            addInteger(3);
            print();
            addInteger(4);
            print();
            addInteger(5);
            print();
            addInteger(1);
            print();
            addInteger(6);
            print();
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }
    }
}

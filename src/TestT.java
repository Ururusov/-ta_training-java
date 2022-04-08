import java.util.ArrayList;
import java.util.Arrays;

public class TestT {
    int in = 5;
    public static void main(String[] args) {
        long a = 0b1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_0101L;
        System.out.println(a);
        ArrayList<Character> arrayList= new ArrayList<>();
        arrayList.add('3');
        arrayList.add('4');
        arrayList.add('2');
        arrayList.add('3');
        ArrayList<Character> spare = new ArrayList<>();

        for (Character number: arrayList) {
            if (!spare.contains(number)){
                spare.add(number);
            }
        }
        System.out.println(spare);
    }
}

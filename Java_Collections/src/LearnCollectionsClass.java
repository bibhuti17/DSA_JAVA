import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
//        some additional functionalities
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(24);
        list.add(3);
        list.add(44);
        list.add(5);

        System.out.println("Max value :" + Collections.max(list));
        System.out.println("Max value :" + Collections.min(list));
        System.out.println("Max value :" + Collections.frequency(list, 1));

        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}

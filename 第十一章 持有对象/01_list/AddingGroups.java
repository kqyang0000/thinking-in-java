import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        System.out.println("---------1---------");
        for (Integer c : collection) {
            System.out.println(c);
        }
        System.out.println("---------2---------");
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
//        list.add(21);   //Runtime error because the underlying array cannot be resized.
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

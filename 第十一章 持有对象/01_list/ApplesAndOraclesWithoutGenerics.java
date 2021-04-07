import java.util.ArrayList;

/**
 * @author kqyang
 */
public class ApplesAndOraclesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Oracle());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        System.out.println("id: " + id);
        return id;
    }
}

class Oracle {

}

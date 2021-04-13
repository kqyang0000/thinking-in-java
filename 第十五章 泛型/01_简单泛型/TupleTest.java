public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();
        System.out.println(f);
//        f.first = "three"; //compile error
        System.out.println(g());
    }
}

class Amphibian {
}

class Vehicle {
}

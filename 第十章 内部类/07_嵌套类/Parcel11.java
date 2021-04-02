/**
 * 如果不需要内部类对象与其外围类对象之间有联系，那么可以将内部类声明为static。这通常称为套嵌类。
 * 普通的内部类对象隐式地保存了一个引用，指向它的外围类对象。当内部类是static时，套嵌类意味着：
 * 1）要创建套嵌类对象，并不需要其外围类的对象
 * 2）不能从套嵌类的对象中访问非静态的外围类对象。
 * 3）普通内部类的字段与方法，只能放在类的外部层次上，所有普通内部类不能有static数据和static字
 * 段，也不能包含套嵌类，但是套嵌类可以包含这些所有东西。
 */
public class Parcel11 {

    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
                int x = 10;
            }
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        contents();
        destination("Kqyang");
    }
}

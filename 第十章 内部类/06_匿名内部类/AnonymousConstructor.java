abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    /**
     * 此处不要求变量i一定是final的，因为i被传递给匿名类的基类的构造器，它并不会在匿名类内部被直接使用
     *
     * @param i
     * @return
     */
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

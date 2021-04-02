public class TestBed {
    public void f() {
        System.out.println("f()");
    }

    /**
     * 可以使用套嵌类来放置测试代码，当发布产品时再将其剔除
     */
    public static class Tester {
        public static void main(String[] args) {
            TestBed tb = new TestBed();
            tb.f();
        }
    }
}

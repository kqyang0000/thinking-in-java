public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew d = new DotNew();
        Inner inner = d.new Inner();
    }
}

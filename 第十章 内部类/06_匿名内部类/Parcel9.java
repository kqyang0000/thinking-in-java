public class Parcel9 {
    /**
     * 如果定一个内部类，并且希望它使用一个在其外部定义的对象，那么编译器会要求其参数引用是final的。
     * @param dest
     * @return
     */
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Kqyang");
        System.out.println(d.readLabel());
    }
}

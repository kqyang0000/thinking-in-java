/**
 * TrackingSlip类被嵌入在if语句的作用域内，这并不是该类的创建是有条件的，
 * 它其实与别的类一起编译过了。然而，在定义TrackingSlip的作用域之外，他
 * 是不可用的，除此之外，它与普通的类一样。
 *
 */
public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
            System.out.println("s:" + s);
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }
}

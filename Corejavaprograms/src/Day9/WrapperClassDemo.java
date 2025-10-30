package Day9;
public class WrapperClassDemo {
    public static void main(String[] args) {
        // Instead of new Integer(1), use valueOf()
        Integer i = Integer.valueOf(1);
        System.out.println(i);

        // Convert to int using intValue()
        int b = i.intValue();
        System.out.println(b);

        // Without using intValue() (auto-unboxing)
        int c = i; // auto-unboxing
        System.out.println(c);
    }
}

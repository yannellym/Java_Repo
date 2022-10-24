public class WrapperClass {
    public static void main(String[] args) {
        byte x = 100;
        Integer y = Integer.valueOf(x);

        String s = Byte.toString(x);
        byte z = Byte.parseByte(s);

        System.out.println(z);
    }
}

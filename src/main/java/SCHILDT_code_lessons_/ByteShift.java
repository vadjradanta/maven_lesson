package SCHILDT_code_lessons_;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение а:" + a);
        System.out.println("i and b: " + i + " " + b);
    }
}

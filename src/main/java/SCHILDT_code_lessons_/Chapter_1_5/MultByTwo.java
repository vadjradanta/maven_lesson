package SCHILDT_code_lessons_.Chapter_1_5;

public class MultByTwo {
    public static void main(String args[]) {
        int i;
        int num = 0xFFFFFFE;
        for(i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

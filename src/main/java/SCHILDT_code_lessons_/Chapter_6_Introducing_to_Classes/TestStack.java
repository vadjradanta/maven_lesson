package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

// В этом классе организуются два целочисленных стека, в каждом из которых
// сначала размещаются, а затем извлекаются некоторые значения

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        //извлечь эти числа из стека
        System.out.println("Содержимое стека mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Содержимое стека mystack2");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}

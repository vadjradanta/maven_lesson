package SCHILDT_code_lessons_.Chapter_6_Introducing_to_Classes;

//В этом классе определяется целочисленный стек,
//в котором можно хранить до 10 целочисленных значений

class Stack {
    int stck[] = new int[10];
    int tos;

    //инициализировать вершину
    Stack(){
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item){
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

package org.ananta.test_mvn.practical_lesson1;

public class IntList {

    private final static int DEFAULT_SIZE = 10;
    private int [] values;
    private int length = 0;

    /**
     * создаёт пустой список с размером буфера по умолчанию
     */
    public IntList() {
        this(DEFAULT_SIZE);
    }

    /**
     * создаёт пустой список с размером буфера равным size
     * @param size размер буфера
     */
    public IntList(int size) {
        values = new int[size];
    }

    public IntList(int [] elements) {
        if (elements.length != 0) {
            values = new int[elements.length + elements.length / 2];
            length = elements.length;
        }
        else values = new int[DEFAULT_SIZE];
    }

    public IntList(IntList list) {
        this(list.size() == 0 ? DEFAULT_SIZE : list.size());
        if (list.size() != 0){
            for (int i = 0;  i < list.size(); i++) {
                add(list.get(i));

            }
            length = list.size();
        }
    }

    /**
     * Возвращает длину списка
     * @return длина списка
     */
    public int size(){
        return length;

    }

    private void resizeArray(int countAddedElements){
        int [] temp = new int[values.length + countAddedElements];
        for (int i = 0; i < length; i++){
            temp[i] = values[i];
        }

        values = temp;

    }

    public void add(int element){
        if (length == values.length){
            resizeArray(DEFAULT_SIZE);
        }
            values[length++] = element;

    }

    public void addAll(int [] elements){
        if (values.length - length >= elements.length){
            resizeArray(elements.length < DEFAULT_SIZE ? DEFAULT_SIZE : (elements.length + DEFAULT_SIZE));
        }
        for (int i = 0;  i < elements.length; i++) {
            values[length] = elements[i];
        }


    }

    public void remove(int index){

    }

    public int get(int index){
        if (index >= length || index < 0) throw new IndexOutOfBoundsException();
        return values[index];

    }

    public void push(int element){
        add(element);

    }

    public int peek(){
                return get(length - 1);
    }

    public int pop(){
        int result = peek();
        length--;
        return result;
    }

}

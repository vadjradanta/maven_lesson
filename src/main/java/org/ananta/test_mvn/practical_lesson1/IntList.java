package org.ananta.test_mvn.practical_lesson1;


public class IntList {

    private final static int DEFAULT_SIZE = 10;
    private int [] values;
    private int length = 0;

    /**
     * Создает пустой список с размером буффера по умолчанию
     *
     */
    public IntList() {
        this(DEFAULT_SIZE);
    }

    /**
     * Создает пустой список с размером буффера равным size
     * @param size размер буффера
     */
    public IntList(int size) {
        values = new int[size];
    }



    public IntList(int [] elements) {
        if(elements.length != 0)  {
            values = new int[elements.length+elements.length/2];
        }
        else values = new int[DEFAULT_SIZE];

        for (int i = 0; i < elements.length; i++){
            add(elements[i]);
        }

    }

    public IntList(IntList list) {
        this(list.size() == 0 ? DEFAULT_SIZE : list.size());
        if (list.size() > 0 ){
            for (int i = 0; i < list.size(); i++){
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
        int [] temp = new int[values.length+countAddedElements];
        for (int i = 0; i < length; i++){
            temp[i] = values[i];
        }
        values = temp;
    }

    public void add(int element){
        if(length == values.length) {
            resizeArray(DEFAULT_SIZE);
        }
        values[length++] = element;

    }

    public void addAll(int [] elements){
        if( values.length - length >= elements.length) {
            resizeArray(elements.length < DEFAULT_SIZE ? DEFAULT_SIZE : (elements.length + DEFAULT_SIZE));
        }

        for (int i = 0; i < elements.length; i++){
            values[length++] = elements[i];
        }

    }


    /**
     * Получает элеент списка по его индексу
     * @param index индекс
     * @return элемент
     */
    public int get(int index){
        if( index >= length || index < 0) throw new IndexOutOfBoundsException();

        return values[index];
    }

    /**
     * Добавляет элемент в конец списка
     * @param element
     */
    public void push(int element){
        add(element);
    }

    /**
     * Получает элемент с конца списка
     * @return элемент
     */
    public int peek(){
        return get(length-1);
    }


    /**
     * Получает элемент с конца списка и удаляет его из списка.
     * Размер списка уменьшается на 1
     * @return элемент
     */
    public  int pop(){
        int result = peek();
        length--;
        return result;
    }

    /**
     * Сравнение списков по значениям
     * @param list
     * @return
     */
    public boolean compare(IntList list){
        if(size() != list.size()) return false;

        for (int i=0; i< size(); i++){
            if(get(i) != list.get(i)) return false;
        }

        return true;
    }


    /**************************  Методы для домашней работы ***********************************/

    /**
     * Преобразует список в строку, где элементы будут через запятую
     * @return
     */
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder("[");
        for (int i=0; i<length;i++){
            str.append(get(i));
            if(i!=length-1) str.append(", ");
        }
        str.append("]");
        return str.toString();

    }

    /**
     * Возвращает массив с элементами списка.
     * Возвращаемый массив новый и не связан с массивом, где хранятся элементы списка
     * @return
     */
    public int[] toArray(){

        //необходимо пройтись по всем хранимым данным в массиве и собрать их в строку типа "1,2,3,4,5,6"
        return null;
    }

    /**
     * Добавляет элементы в список из другого списка
     * @param list
     */
    public void addAll(IntList list){
        //делается также как и другой метод addAll но входной аргумент другой
    }


    /**
     * Удаляет элемент по указанному индексу.
     * Сдвигает элементы влево, чтобы заполнить образовавшийся пробел.
     * Длина списка уменьшится на 1
     *
     * @param index индекс элемента для удаления
     */
    public  void remove(int index){
        /**
         * Здесь 2 случая:
         * 1. Элемент удаляется с конца списка и его можно удалить уменьшив length списка.
         * 2. Элемент в середине списка. Мы должны скопировать часть массива справа от удаляемого элемента в тот же массив но на одну ячейку левее чем он был.
         * Это можно делать библиотечным методом(см яндекс копирование массива) или через for по 1 элементу перемещать.
         *
         * После чего уменьшается length на 1.
         * нужно проверять в начеле метода, попадает ли индекс в диапазон индексов списка и если нет то ничего не удалять
         */

    }

    /**
     * Ищет в списке все вхождения переданного значения и возвращает их индексы.
     * @param value значение которое ищем в списке
     * @return массив индексов найденных элементов
     */
    public int[] findIndexes(int value){
////        value = 5;
////        int array[] = new int[]{1, 7, 9, 7, 3, 4, 7, 64, 33};
////        int index = -1;
////        int count
////
////        for (int i = 0; i < array.length; i++){
////            if (array[i] == value) {
////
////            }
////        }





        /*
        Мы находим в цикле элементы и сравниваем с переданным значением, если они равны, то мы складываем их индекс(счетчик в for)
        во временный массив.
        Когда дойдем до конца массива, можно будет вернуть этот временны массив с индексами как результат
         */
        return null;
    }


    /**
     * Находит в списке элемент и возвращает первое найденное значение
     * @param value значение которое мы ищем
     * @return индекс найденного элемента
     */
    public int findFirst(int value) {
        value = 7;
        int array[] = new int[]{1, 7, 9, 7, 3, 8, 7, 11, 21};
        int index = 0;

        for (int i = 0; i > array.length; i++) {
            if (array[i] == value)
                index = i; break;
        }


        //делается тоже что и в findIndexes, но при первом нахождении совпадения элемента сразу возвращаем из метода его индекс
        return 0;
    }

    /**
     * Находит в списке элемент и возвращает  последнее значение
     * @param value значение которое мы ищем
     * @return индекс найденного элемента
     */
    public int findLast(int value) {
        value = 3;
        int array[] = new int[]{1, 8, 9, 7, 3, 8, 3, 10, 22};
        int index = 0;

        for (int i = array.length; i >= 0; i--) {
            if (array[i] == value)
                index = i; break;
        }

        return index;
    }

}
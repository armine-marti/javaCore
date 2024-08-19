package homework.dynamicarray;

public class DynamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length){
            extend();
        }else
            array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] biggerArray = new int[array.length+10];
        for (int i = 0; i<array.length; i++){
            biggerArray[i] = array[i];
            //we can use here arraycopy method//
        }
        array = biggerArray;

    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        } else
            return array[index];


    }
    public void deleteByIndex(int index){
        if (index<0|| index>size){
            System.out.println("wrong index");
            return;
        }
        for (int i = index+1; i<size;i++){
            array[i-1] = array[i];
        }
        size--;
    }

    public void set(int index, int value){
        if (index<0||index>size){
            System.out.println("wrong index");
            return;
        }
        array[index] = value;

    }
    public void add(int index, int value){
        if(index<0||index>size){
            System.out.println("wrong index");
            return;
        }
        if (array.length==size){
            extend();
        }
        for(int i = size; i>=index; i--){
            array[index+1]= array[i];
        }
        array[index] = value;
        size++;
    }

    public int getIndexByValue(int value){
        for(int i = 0; i<size;i++){
            if(array[i]==value){
                return i;
            }
        }return -1;
    }

    public boolean exists(int value){
        for(int i = 0;i<size;i++){
            if(array[i] == value){
                return true;
            }
        }return false;
    }
    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for(int i = 0; i<size;i++){
            System.out.print(array[i] + " ");
        }
    }



}

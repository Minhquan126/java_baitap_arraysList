import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
     int DEFAULT_CAPACITY = 10;
     private Object elements[];
     public MyList(){
elements = new Object[DEFAULT_CAPACITY];
     }
public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
}
public void add(E e){
         if (size >= elements.length){
             ensureCapa();
         }
         elements[size++] = e;
}
public void addIndex(int index,E element){
         if (size >= elements.length){
             ensureCapa();
         }
    for (int i = size - 1; i >= index; i--) {
        elements[i + 1] = elements[i];
        size++;
    }elements[index] = element;

}
public E get(int index){
         if (index < 0 || index > size){
             throw new IndexOutOfBoundsException("Index :" + index + ", side :" + size);
         }
         return (E) elements[index];
}
public E remove(int index){
         Object temp = elements[index];
    for (int i = index; i < size - 1; i++) {
        elements[i] = elements[i + 1];
    }
    elements[size - 1] = null;
//    elements = Arrays.copyOf(elements,elements.length - 1);
    return (E) temp;
}
public int size(){
         int count = 0;
    for (int i = 0; i < elements.length; i++) {
        if (elements[i] != null){
            count++;
        }
    }
    return count;
}
public boolean containe(E element){
         boolean check = false;
    for (int i = 0; i < elements.length; i++) {
        if (elements[i] == element){
            check = true;
        }
    }
    return check;
}
public E clear(){
    for (int i = 0; i < elements.length; i++) {
        elements[i] = null;
    }

    return (E) elements;
}
}

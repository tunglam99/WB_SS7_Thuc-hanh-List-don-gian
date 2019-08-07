import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensuaCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e){
        if (size == elements.length){
            ensuaCapa();
        } else {
            elements[size++] = e;
        }
    }

    public E get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", size:" +i);
        } else {
            return (E) elements[i];
        }
    }
}

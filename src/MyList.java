import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void ensureCapa(int minimum) {
        int newSize = minimum;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (this.size == this.elements.length) {
            this.ensureCapa();
        } else {
            for (int i = index; i < this.size; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
        }
        this.size++;
    }

    public E remove(int index) {
        E tmp = (E) elements[index];
        for (int i = index; i < this.size; i++) {
            elements[i] = elements[i + 1];
        }
        this.size--;

        return tmp;
    }

    public int size() {
        return this.size;
    }

    public E clone(int index) {
        return (E) elements[index];
    }

    public boolean contains(E obj) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E obj) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E obj) {
        this.ensureCapa();
        this.size++;
        elements[size - 1] = obj;
        return true;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + this.size);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
}

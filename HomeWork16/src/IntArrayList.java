import java.util.Arrays;
import java.util.Iterator;

public class IntArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;


    public IntArrayList() {
        elements = (T[]) new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public int size() {
        return count;
    }

    boolean contains(T value) {
        boolean ContainsCheck = false;
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(value)) {
                ContainsCheck = true;
                break;
            }
        }
        return ContainsCheck;
    }

    public void add(T e) {
        if (capacity == count) {
            grow();
        }
        elements[count] = e;
        count++;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        T[] newElements = (T[]) new Object[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    void remove(int index) {
        int ArrayLength = elements.length;
        for (int i = index; i < ArrayLength - 1; i++) {
            elements[i] = elements[i+1];
            ArrayLength--;
        }
    }

    public void sort() {

    }

    void addAll(IntArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (capacity == count) {
                grow();
            }
            add(list.get(i));
        }
    }

    T[] toArray() {
        return Arrays.copyOf(elements, size());
    }

    public int indexOf(int value) {
        return 0;
    }
    public Iterator<T> iterator() {
        return new MyIter();
    }
    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
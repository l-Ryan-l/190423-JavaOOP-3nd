import java.util.Iterator;

public class listOfElements<T> implements Iterable<T> {
    int size = 0;
    private Element<T> first;
    private Element<T> last;

    void addLast(T data) {
        Element<T> nextElement = new Element<>(data);
        Element<T> curentElement = first;

        if (first == null) {
            first = nextElement;
            last = nextElement;
        } else {
            while (curentElement.next != null) {
                curentElement = curentElement.next;
            }
            curentElement.next = nextElement;
        }
        size += 1;
    }

    void addFirst(T data) {
        Element<T> nextElement = new Element<>(data);

        if (last == null) {
            first = nextElement;
            last = nextElement;
        } else {
            nextElement.next = first;
            first = nextElement;
        }
        size += 1;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Element<T> iterElem = first;
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public T next() {
                T value = iterElem.getData();
                iterElem = iterElem.next;
                index ++;
                return value;
            }
        };
    }
}

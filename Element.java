public class Element<T> {
    T data;
    Element<T> next;

    @Override
    public String toString() {
        return String.format("Element %s", data);
    }

    public Element(T data) {
        this.data = data;
    }

    public boolean isNext() {
        return this.next != null;
    }

    public T getData() {
        return data;
    }
}


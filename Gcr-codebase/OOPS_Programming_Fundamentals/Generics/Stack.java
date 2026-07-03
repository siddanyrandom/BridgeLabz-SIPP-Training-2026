import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty())
            return null;

        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty())
            return null;

        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void display() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

import java.util.List;

public class PrintUtility {

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

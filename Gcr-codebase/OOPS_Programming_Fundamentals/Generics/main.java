import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> student =
                new Pair<>("Siddhartha", 21);

        System.out.println(student);

        // Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());

        // Generic Method
        Integer[] numbers = {45, 12, 89, 76, 34};

        System.out.println("Maximum = " + Utility.findMax(numbers));

        // Repository
        Repository<String> repo = new Repository<>();

        repo.add("Java");
        repo.add("Python");
        repo.add("C++");

        System.out.println("\nRepository Data:");
        repo.display();

        // Wildcard List<?>
        List<String> names =
                Arrays.asList("Ram", "Shyam", "Mohan");

        System.out.println("\nPrinting List:");
        PrintUtility.printList(names);
    }
}

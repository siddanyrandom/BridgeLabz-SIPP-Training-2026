package Stack;

public class UndoBuffer {
    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public static void main(String[] args) {

        UndoBuffer ub = new UndoBuffer(5);

        ub.push("Type A");
        ub.push("Type B");
        ub.push("Delete C");

        System.out.println("Top Edit: " + ub.peek());

        System.out.println("Undo: " + ub.pop());

        System.out.println("Top Edit: " + ub.peek());

        ub.push("Paste D");

        while (!ub.isEmpty()) {
            System.out.println("Undo: " + ub.pop());
        }
    }

    public boolean push(String edit) {
        if (top == data.length - 1) return false;
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) throw new RuntimeException("Nothing to undo");
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) throw new RuntimeException("Nothing to peek");
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

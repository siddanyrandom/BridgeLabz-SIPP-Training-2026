package Stack;

public class CallStack {
    private Frame top;

    public static void main(String[] args) {

        CallStack cs = new CallStack();

        cs.push("main()");
        cs.push("funA()");
        cs.push("funB()");

        System.out.println("Current Function: " + cs.peek());

        System.out.println("Returning from: " + cs.pop());

        System.out.println("Current Function: " + cs.peek());

        cs.push("funC()");

        System.out.println("Current Function: " + cs.peek());

        while (!cs.isEmpty()) {
            System.out.println("Popped: " + cs.pop());
        }
    }

    public void push(String fn) {
        top = new Frame(fn, top);
    }

    public String pop() {
        if (isEmpty())
            throw new RuntimeException("No active call");

        String x = top.functionName;
        top = top.next;
        return x;
    }

    public String peek() {
        if (isEmpty())
            throw new RuntimeException("No active call");

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    static class Frame {
        String functionName;
        Frame next;

        Frame(String n, Frame nx) {
            functionName = n;
            next = nx;
        }
    }
}

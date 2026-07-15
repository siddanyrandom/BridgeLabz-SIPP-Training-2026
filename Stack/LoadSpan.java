package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LoadSpan {
    public static int[] loadSpan(int[] load) {
        int n = load.length;
        int[] span = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && load[st.peek()] <= load[i]) st.pop();
            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        return span;
    }

    static void main() {
        int[] arr = {1, 2, 4, 6, 8, 2, 5};
        System.out.println(loadSpan(arr));
    }
}

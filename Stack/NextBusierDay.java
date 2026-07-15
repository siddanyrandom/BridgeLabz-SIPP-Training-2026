package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextBusierDay {
    public static int[] nextBusierDay(int[] visitors) {
        int[] ans = new int[visitors.length];
        Arrays.fill(ans, -1);
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < visitors.length; i++) {
            while (!st.isEmpty() && visitors[i] > visitors[st.peek()])
                ans[st.pop()] = visitors[i];
            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] result = nextBusierDay(new int[]{1, 2, 4, 6, 7});
        System.out.println(Arrays.toString(result));
    }
}

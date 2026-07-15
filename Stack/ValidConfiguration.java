package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidConfig {

    public static void main(String[] args) {
        ValidConfig vc = new ValidConfig();

        System.out.println(vc.isValidConfig("()"));
        System.out.println(vc.isValidConfig("()[]{}"));
        System.out.println(vc.isValidConfig("([{}])"));
        System.out.println(vc.isValidConfig("(]"));
        System.out.println(vc.isValidConfig("([)]"));
        System.out.println(vc.isValidConfig("{[]}"));
    }

    public boolean isValidConfig(String s) {
        Deque<Character> st = new ArrayDeque<>();
        Map<Character, Character> mp = Map.of(')', '(', ']', '[', '}', '{');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty() || st.pop() != mp.get(c))
                    return false;
            }
        }
        return st.isEmpty();
    }
}

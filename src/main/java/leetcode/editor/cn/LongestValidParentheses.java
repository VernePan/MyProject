package leetcode.editor.cn;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class LongestValidParentheses {

    @Test
    public void test(){
        String s = "(()";
        int i = longestValidParentheses(s);
        System.out.println(i);
    }
    public int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}

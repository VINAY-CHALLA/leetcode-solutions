class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                c.push(s.charAt(i));
            } else {
                if (c.empty()) {
                    return false;
                }

                char top = c.peek();

                if ((s.charAt(i) == ')' && top == '(') ||
                        (s.charAt(i) == '}' && top == '{') ||
                        (s.charAt(i) == ']' && top == '[')) {

                    c.pop();
                } else {
                    return false;
                }
            }
        }
        return c.empty();
    }
}
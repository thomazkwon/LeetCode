class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (c == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    } else if (c == '}') {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    } else if (c == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
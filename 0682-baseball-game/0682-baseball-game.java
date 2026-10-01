import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int first = s.pop();
                int second = s.peek();

                s.push(first);
                s.push(first + second);
            }
            else if (op.equals("D")) {
                s.push(2 * s.peek());
            }
            else if (op.equals("C")) {
                s.pop();
            }
            else {
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!s.isEmpty()) {
            sum += s.pop();
        }

        return sum;
    }
}
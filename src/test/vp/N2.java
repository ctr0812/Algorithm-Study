package test.vp;


import java.util.Arrays;
import java.util.Stack;

class N2 {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int n = 1;
        Stack<Integer> st = new Stack();
        Stack<Integer> st2 = new Stack();

        for (int i = 0; i < arr.length; i++) {

            if (n <= arr[i]) {
                while (n <= arr[i]) {
                    st.push(n);
                    n += 1;
                }
            }

            if (st.isEmpty()) {
                break;
            } else {
                while (st.peek() >= arr[i]) {
                    st2.push(st.pop());
                    if (st.isEmpty()) {
                        break;
                    }
                }
            }
        }

        if (st2.size() != arr.length) {
            return false;
        } else {
            if (!Arrays.equals(st2.stream().mapToInt(Integer::intValue).toArray(),arr)) {
                return false;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        N2 solution = new N2();
        int[] arr = {3, 1, 2};
        System.out.println(solution.solution(arr));
    }
}
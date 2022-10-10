package programmars.stackqueue;



import java.util.Stack;

class N2 {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();

        // 효율성 문제 발생
//        for (String t : s.split("")) {
//            if(t.equals("(")) stack.push("(");
//            else if(stack.isEmpty()) answer = false;
//            else stack.pop();
//        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push("(");
            else if(stack.isEmpty()) answer = false;
            else stack.pop();
        }


        if(!stack.isEmpty()) answer = false;
        return answer;
    }



    public static void main(String[] args) {
        String s = "()()";
        N2 sol = new N2();
        System.out.println(sol.solution(s));

    }
}

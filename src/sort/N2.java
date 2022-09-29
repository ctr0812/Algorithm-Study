package sort;

import java.util.Arrays;

class N2 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strings = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String s : strings) {
            answer.append(s);
        }
        if(strings[0].equals("0")) answer = new StringBuilder("0");

        return answer.toString();
    }


    public static void main(String[] args) {
        int[] numbers = {3, 337, 32, 5, 9};
//        int[] numbers = {0, 0};
        N2 solution = new N2();
        System.out.println(solution.solution(numbers));
    }
}
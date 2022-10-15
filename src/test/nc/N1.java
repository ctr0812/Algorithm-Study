package test.nc;


import java.util.*;

public class N1 {

    public String solution(String source) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < source.length(); i++) {
            if (!set.contains(String.valueOf(source.charAt(i)))) {
                set.add(String.valueOf(source.charAt(i)));
            } else {
                list.add(String.valueOf(source.charAt(i)));
            }
        }

        String[] strings = set.stream().toArray(String[]::new);
        Arrays.sort(strings);
        Collections.sort(list);

        for (String string : strings) {
            answer += string;
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        N1 solution = new N1();
        System.out.println(solution.solution("execute"));

    }
}

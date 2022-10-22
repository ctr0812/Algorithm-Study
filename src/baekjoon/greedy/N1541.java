package baekjoon.greedy;

import java.util.*;

public class N1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.next(), "\\+|- ",true);
        ArrayList<String> list = new ArrayList<>();

        int answer = 0;

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }

        boolean bool = false;
        for (int i = 1; i < list.size(); i+=2) {
            if (list.get(i).equals("-")) {
                if (!bool) {
                bool = true;
                }
            }
            else{
                if (bool) {
                    list.set(i, "-");
                }
            }
        }
        answer += Integer.parseInt(list.get(0));
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i).equals("+")) answer += Integer.parseInt(list.get(i + 1));
            if (list.get(i).equals("-")) answer -= Integer.parseInt(list.get(i + 1));
        }
        System.out.println(answer);
    }
}

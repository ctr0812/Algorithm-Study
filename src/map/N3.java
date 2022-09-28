package map;


import java.util.Arrays;
import java.util.HashSet;

class N3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> set = new HashSet<>();
        set.addAll(Arrays.asList(phone_book));
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                String prefix = phone.substring(0, i);
                if (set.contains(prefix)) {
                    answer = false;
                }
            }
        }
        return answer;
    }



    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        String[] phone_book = {"12","123","1235","567","88"};
        N3 sol = new N3();
        System.out.println(sol.solution(phone_book));
    }
}
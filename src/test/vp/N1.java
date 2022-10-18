package test.vp;


public class N1 {
    public int solution(String phone_number) {

        if (phone_number.length() < 11 || phone_number.length() > 16) {
            return -1;
        }

        if (phone_number.startsWith("+82-10-") && phone_number.charAt(11) == '-' && phone_number.length() == 16) {
            for (int i = 7; i < phone_number.length(); i++) {
                if (i == 11) continue;
                if (0 <= phone_number.charAt(i) - '0' && phone_number.charAt(i) - '0' <= 9) {
                } else return -1;
            }
            return 3;
        }

        if (phone_number.startsWith("010-") && phone_number.charAt(8) == '-' && phone_number.length() == 13) {
            for (int i = 4; i < phone_number.length(); i++) {
                if(i == 8) continue;
                if (0 <= phone_number.charAt(i) - '0' && phone_number.charAt(i) - '0' <= 9) {
                    System.out.println(phone_number.charAt(i) - '0');
                } else return -1;
            }   return 1;
        }

        if (phone_number.startsWith("010") && phone_number.length() == 11) {
            for (int i = 0; i < phone_number.length(); i++) {
                if (0 <= phone_number.charAt(i) - '0' && phone_number.charAt(i) - '0' <= 9) {
                } else return -1;
            }  return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        N1 solution = new N1();
        String p = "+82-10-3434-2323";
        String p2 = "010-1234-5678";
        System.out.println(solution.solution(p2));
    }
}
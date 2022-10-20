package test.brain;

public class Solution {
    public static void main(String[] args) {
        String s = "Hi my name is Chae Tae Rim";
        String w = "Chae";
        System.out.println(solution(s,w));
    }

    public static int solution(String s, String w) {

           String[] sArray =  s.split(" ");
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i].equals(w)) {
                    return i+1;
                }
            }
            return 0;
    }
}

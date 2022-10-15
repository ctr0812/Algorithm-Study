package test.nc;


public class N2 {
    public int solution(int[] music) {

        int answer = 0;
        int curr = 1;

        for (int i = 0; i < music.length; i++) {
            if (curr <= 7 && music[i] >= 8) {
                answer += (8 - curr) / 2 + 1 + (music[i] + 1 - 8) / 2;
                curr = music[i];
                continue;
            }
            if (curr >= 8 && music[i] <= 7) {
                answer += (curr + 1 - 8) / 2 + 1 + (8 - music[i]) / 2;
                curr = music[i];
                continue;
            } else {
                if (curr % 2 == 0 && music[i] % 2 == 0) {
                    answer += Math.abs((music[i] - curr)) / 2 + 1;
                } else {
                    answer += (Math.max(music[i] ,curr) + 1 - Math.min(music[i] ,curr)) / 2;
                }
                curr = music[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        N2 solution = new N2();
        int[] music = new int[]{10,9,4,5,12};
        int[] music2 = new int[]{6,4,2,11};
        System.out.println(solution.solution(music));

    }
}

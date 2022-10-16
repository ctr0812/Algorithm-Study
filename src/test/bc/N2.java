package test.bc;



class N2 {


    public int solution(int n) {
        int answer = 0;

        int i = 1;
        while (true) {
            if (n >= (int)Math.pow(5, i)) {
                answer += n / (int)Math.pow(5, i);
            } else break;
            i++;
        }
        return answer;
    }




    public static void main(String[] args) {
        N2 solution = new N2();
        System.out.println(solution.solution((int) (Math.pow(2,31)-1)));
    }
}
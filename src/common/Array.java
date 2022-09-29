package common;

import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        Integer[] integerArr = {1, 2, 3, 4};
        String[] stringArr = {"a", "b", "c"};

        // 배열 자르기 , 마지막 to 포함 X
        int[] copy = Arrays.copyOfRange(intArr,1, 4);

        // int 배열 -> string 배열 변환
        String[] strings = Arrays.stream(intArr).mapToObj(String::valueOf).toArray(String[]::new);

        // int 배열 -> Integer 배열 변환
        Integer[] nums = Arrays.stream(intArr).boxed().toArray(Integer[]::new);

        // 배열 오름 차순 정렬
        Arrays.sort(intArr);
        Arrays.sort(integerArr,(o1,o2)->{
            return o1 - o2;
        });

        // 내림 차순 정렬 ( Integer[] 로 선언해야한다 )
        Arrays.sort(integerArr, Collections.reverseOrder());
        Arrays.sort(integerArr,(o1,o2)->{
            return o2 - o1;
        });

        // 문자열 오름차순
        Arrays.sort(stringArr, (o1, o2)->{
            return o1.compareTo(o2);
        });
        System.out.println(Arrays.toString(stringArr));

        // 문자열 내림차순
        Arrays.sort(stringArr, (o1, o2)->{
            return o2.compareTo(o1);
        });
        System.out.println(Arrays.toString(stringArr));



    }
}

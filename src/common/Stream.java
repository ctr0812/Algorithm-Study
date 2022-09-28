package common;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // stream int 배열 변환
        intList.stream().mapToInt(Integer::intValue).toArray();

        // stream string 배열 변환
        stringList.stream().toArray(String[]::new);
    }


}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static List<String> getNumbers(int limit) {
        List<String> result = new ArrayList<>();

        for(int i=1; i<limit; i++){
            result.add(getNumber(i));

        }
        return result;
    }

    private static String getNumber(int i) {

        if(isMultiple(i, 3) && isMultiple(i, 5)){
            return FIZZ + BUZZ;

        }else if(isMultiple(i, 3)){
            return FIZZ;

        } else if(isMultiple(i,5)){
            return BUZZ;

        }
            return "" + i;

        }

    private static boolean isMultiple(int i, int multiple) {
        return i % multiple == 0;
    }
}

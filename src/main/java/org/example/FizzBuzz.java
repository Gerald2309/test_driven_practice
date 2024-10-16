package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> getNumbers(int limit) {
        List<String> result = new ArrayList<>();

        for(int i=1; i<limit; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                result.add("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
                result.add("Fizz");


            } else if(i % 5 == 0){
                System.out.println("Buzz");
                result.add("Buzz");

            }
            else{
                System.out.println(i);
                result.add(String.valueOf(i));

            }







    }

        return result;
    }
}
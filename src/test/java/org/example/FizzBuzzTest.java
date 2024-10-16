package org.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private FizzBuzz game;

    //Función que se ejecuta siempre antes de los test
    @Before
    public void before() {
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5() {
        List<String> numbers = game.getNumbers(30);
        Assert.assertEquals("1", numbers.get(0));
        Assert.assertEquals("2", numbers.get(1));
        Assert.assertEquals("4", numbers.get(3));

    }

    @Test
    public void should_return_Fizz_when_multipleOf3() {
        List<String> numbers = game.getNumbers(30);
        Assert.assertEquals(FIZZ, numbers.get(2));
        Assert.assertEquals(FIZZ, numbers.get(5));

    }

    @Test
    public void should_return_Buzz_when_multipleOf5() {
        List<String> numbers = game.getNumbers(21);
        Assert.assertEquals(BUZZ, numbers.get(4));
        Assert.assertEquals(BUZZ, numbers.get(9));
        Assert.assertEquals(BUZZ, numbers.get(19));


    }

    @Test
    public void should_return_FizzBuzz_when_multipleOf3And5() {
        List<String> numbers = game.getNumbers(20);
        Assert.assertEquals(FIZZ + BUZZ, numbers.get(14));
    }


}

package com.rafaelamaral;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@DisplayName("Test Math Operations of Class SimpleMath")
public class SimpleMathTest {

    @Test
    @DisplayName("should return result sum when call SimpleMath.sum()")
    public void shouldReturnResultSumWhenCallSimpleMathSum(){
        // GIVEN
        var numberOne = 5.0D;
        var numberTwo = 5.0D;
        var simpleMath = new SimpleMath();

        // WHEN
        var result = simpleMath.sum(numberOne, numberTwo);
        var expectedValue = 10.0;

        //THEN
        assertEquals(expectedValue, result , () -> numberOne + " + " + numberTwo + " did not produce expected " + expectedValue + "!");
        assertNotEquals(9.2, result);
        assertNotNull(result);
    }

    @Test
    @DisplayName("should return result subtraction when call simpleMath.subtraction()")
    public void shouldReturnResultSubtractionWhenCallSimpleMathSubtraction(){
        // GIVEN
        var numberOne = 20D;
        var numberTwo = 10D;
        var simpleMath = new SimpleMath();

        // WHEN
        var result = simpleMath.subtraction(numberOne, numberTwo);
        var expectedValue = 10D;

        //THEN
        assertEquals(expectedValue, result, ()-> numberOne + " - " + numberTwo + " did not produce expected " + expectedValue + "!");
    }

    @Test
    @DisplayName("should return result multiplication when call SimpleMath.multiplication()")
    public void shouldReturnResultMultiplicationWhenCallSimpleMathMultiplication(){
        //GIVEN
        var numberOne = 10D;
        var numberTwo = 5D;
        var simpleMath = new SimpleMath();

        //WHEN
        var result = simpleMath.mulyiplication(numberOne, numberTwo);
        var expectedValue = 50D;

        //THEN
        assertEquals(expectedValue, result, ()-> numberOne + " * " + numberTwo + " did not produce expected " + expectedValue + "!");
    }

    @Test
    @DisplayName("should return resul division when call SimpleMath.division()")
    public void shouldReturnResultDivisionWhenCallSimpleMathDivision(){
        //GIVEN
        var numberOne = 10D;
        var numberTwo = 5D;
        var simpleMath = new SimpleMath();

        //WHEN
        var result = simpleMath.division(numberOne, numberTwo);
        var expectedValue = 2D;

        //THEN
        assertEquals(expectedValue, result, ()-> numberOne + " / " + numberTwo + " did not produce expected " + expectedValue + "!");
    }

    @Test
    @DisplayName("should return result of media when call SimpleMath.media()")
    public void shouldReturnResultOfMediaWhenCallSimpleMathMedia(){
        //GIVEN
        var numberOne = 10.0;
        var numberTwo = 10.0;
        var simpleMath = new SimpleMath();

        //WHEN
        var result = simpleMath.average(numberOne, numberTwo);
        var expectedValue = 10;

        //THEN
        assertEquals(expectedValue, result, ()-> " Media did not produce expected " + expectedValue + "!");
    }

    @Test
    @DisplayName("should return result of media when call SimpleMath.squareRoot()")
    public void shouldReturnResultOfMediaWhenCallSimpleMathSquareRoot(){
        //GIVEN
        var square = 81D;

        var simpleMath = new SimpleMath();

        //WHEN
        var result = simpleMath.squareRoot(square);
        var expectedValue = 9;

        //THEN
        assertEquals(expectedValue, result, ()-> " The square did not produce expected " + expectedValue + "!");
    }


}
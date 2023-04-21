package com.javatesting;


import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void AddTwoNumber(){
        Calculator calculator=new Calculator();

        assertEquals(4,calculator.add(2,2));

    }

    @Test
    public void Add5plus5(){
        Calculator calculator=new Calculator();

        assertEquals(10,calculator.add(5,5));

    }


}

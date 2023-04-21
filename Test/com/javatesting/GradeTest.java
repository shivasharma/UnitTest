package com.javatesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GradeTest  {

    @Test
    public void fiftyNineShouldReturnF(){
        Grade grade=new Grade();
        assertEquals("F",grade.gradeLetter(59));
    }

    @Test
    public void sixtyNineShouldReturnD(){
        Grade grade=new Grade();
        assertEquals("D",grade.gradeLetter(69));
    }

    @Test
    public void seventyNineShouldReturnC(){
        Grade grade=new Grade();
        assertEquals("C",grade.gradeLetter(79));
    }

    @Test
    public void eightyNineShouldReturnB(){
        Grade grade=new Grade();
        assertEquals("B",grade.gradeLetter(89));
    }

    @Test
    public void NightyShouldReturnA(){
        Grade grade=new Grade();
        assertEquals("A",grade.gradeLetter(90));
    }

    @Test
    public void negativeOneShouldFail(){
        Grade grade=new Grade();
        assertThrows(IllegalArgumentException.class,() -> grade.gradeLetter(-1));
        assertEquals("A",grade.gradeLetter(90));
    }

}
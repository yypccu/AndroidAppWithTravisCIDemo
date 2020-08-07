package io.yyp.androidappwithtraviscidemo;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyMathTest {

    private MyMath SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new MyMath();
    }

    @Test
    public void plus_1plus1_return2() {
        assertEquals(SUT.plus(1, 1), 2);
    }

    @Test
    public void divide_10divide5_return2() {
        assertThat(SUT.divide(10, 5), is(2));
    }

    @Test
    public void divide_denominatorIsZero_throwRunTimeException() {
        try {
            SUT.divide(7, 0);
            fail("SUT did not throw exception.");
        } catch (RuntimeException e){
            assertThat(e.getMessage(), is("Denominator is zero."));
        }
    }

}
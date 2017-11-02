package com.dansiwiec.mutationtesting.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FalseCoverageTest {

    private FalseCoverage falseCoverage = new FalseCoverage();

    @Test
    public void testAllowingTheMutant(){
        falseCoverage.complexProcess("foo", "bar");
    }

//    @Test
//    public void testKillingTheMutant() {
//        String actual = falseCoverage.complexProcess("foo", "bar");
//        assertThat(actual).isEqualTo("foobzr");
//    }
}
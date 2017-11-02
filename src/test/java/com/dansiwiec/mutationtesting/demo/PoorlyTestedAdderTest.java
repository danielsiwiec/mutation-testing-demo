package com.dansiwiec.mutationtesting.demo;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PoorlyTestedAdderTest {

    private PoorlyTestedAdder poorlyTestedAdder = new PoorlyTestedAdder();

    @Test
    public void testAllowingTheMutant() {
        assertThat(poorlyTestedAdder.add(2,0)).isEqualTo(2);
    }

//    @Test
//    public void testKillingTheMutant() {
//        assertThat(poorlyTestedAdder.add(2,5)).isEqualTo(7);
//    }
}

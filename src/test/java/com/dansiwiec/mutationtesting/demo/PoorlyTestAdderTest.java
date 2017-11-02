package com.dansiwiec.mutationtesting.demo;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PoorlyTestAdderTest {

    private PoorlyTestAdder poorlyTestAdder = new PoorlyTestAdder();

    @Test
    public void testAllowingTheMutant() {
        assertThat(poorlyTestAdder.add(2,0)).isEqualTo(2);
    }

//    @Test
//    public void testKillingTheMutant() {
//        assertThat(poorlyTestAdder.add(2,5)).isEqualTo(7);
//    }
}

package com.dansiwiec.mutationtesting.demo;

public class FalseCoverage {

    public String complexProcess(String a, String b) {
        String concat = a.concat(b);
        return concat.replace('a', 'z');
    }
}

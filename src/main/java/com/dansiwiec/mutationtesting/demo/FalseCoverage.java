package com.dansiwiec.mutationtesting.demo;

public class FalseCoverage {

    public String complexProcess(String a, String b) {
        // To test the mutation uncomment the line below and comment the other two lines
//         return null;
        String concat = a.concat(b);
        return concat.replace('a', 'z');
    }
}

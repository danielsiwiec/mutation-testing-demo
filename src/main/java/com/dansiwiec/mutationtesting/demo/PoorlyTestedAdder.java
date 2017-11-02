package com.dansiwiec.mutationtesting.demo;

public class PoorlyTestedAdder {

    public int add(int a, int b) {
        // To test the mutation uncomment the line below and comment the actual return
//         return a-b;
        return a+b;
    }
}

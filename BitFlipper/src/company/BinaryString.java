package com.company;

public class BinaryString {
    public static long flippingBits(long n){
        //convert to binary
        StringBuilder binaryString = new StringBuilder(Long.toBinaryString(n));
        int length = binaryString.length();
        int zerosNeeded = 32 - length;

        //swap the bits
        for (int i = 0; i < length; i++) {
            binaryString.setCharAt(i, binaryString.charAt(i) == '0' ? '1' : '0');
        }

        //add leading 1s
        for (int i = 0; i < zerosNeeded; i++) {
            binaryString.insert(0, '1');
        }
        //convert back to base 10
        long answer = Long.valueOf(binaryString.toString(), 2);
        return answer;
    }


    public static void main(String[] args) {
        long testData = 542;
        System.out.println(flippingBits(testData));
    }
}

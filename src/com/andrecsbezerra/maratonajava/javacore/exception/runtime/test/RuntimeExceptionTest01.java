package com.andrecsbezerra.maratonajava.javacore.exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // RuntimeException é um tipo de exception unchecked e quando acontece é um erro de desenvolvimento
        // Checked e Unchecked
        int [] nums = {1,2};
        System.out.println(nums[2]);
    }

}

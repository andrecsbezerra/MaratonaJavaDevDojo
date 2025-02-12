package com.andrecsbezerra.maratonajava.introducao;

public class Operadores {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        // Basic Arithmetic
        System.out.println("Addition: " + (a + b));         // 4
        System.out.println("Subtraction: " + (a - b));      // 0
        System.out.println("Multiplication: " + (a * b));   // 4
        System.out.println("Division: " + (a / b));         // 1

        // Compound Assignment
        a += b;
        System.out.println("After +=: " + a);               // 4
        a = 1;  // reset a

        a -= b;
        System.out.println("After -=: " + a);               // -1
        a = 1;  // reset a

        a *= b;
        System.out.println("After *=: " + a);               // 2
        a = 1;  // reset a

        a /= b;
        System.out.println("After /=: " + a);               // 0
        a = 1;  // reset a

        a %= 1;
        System.out.println("After %=: " + a);               // 0
        a = 1;  // reset a

        // Comparison
        System.out.println("Less than: " + (a < b));        // true
        System.out.println("Greater than: " + (a > b));     // false
        System.out.println("Less or equal: " + (a <= b));   // true
        System.out.println("Greater or equal: " + (a >= b)); // false
        System.out.println("Equal to: " + (a == b));        // false
        System.out.println("Not equal to: " + (a != b));    // true

        // Modulus
        System.out.println("Modulus: " + (a % b));          // 1
        // Power Of
        System.out.println("Power: " + Math.pow(a, b));     // 1.0

        // Logical AND
        boolean c = true;
        boolean d = false;

        System.out.println("AND (&&): " + (c && d));    // false
        System.out.println("OR (||): " + (c || d));     // true
        System.out.println("NOT (!): " + (!c));         // false

        // Examples with conditions:
        int x = 5;
        int y = 10;

        System.out.println((x > 0) && (y < 20));        // true
        System.out.println((x > 10) || (y == 10));      // true
        System.out.println((x > 0) && (y < 20) || (x == y));  // true

        // Increment and Decrement
        int age = 10;
        System.out.println("age: " + age);     // 10
        System.out.println("++age: " + (++age)); // 11 (incrementa antes de usar)
        System.out.println("age++: " + (age++)); // 11 (usa antes de incrementar)
        System.out.println("age after age++: " + age); // 12

        System.out.println("--age: " + (--age)); // 11 (decrementa antes de usar)
        System.out.println("age--: " + (age--)); // 11 (usa antes de decrementar)
        System.out.println("age after age--: " + age); // 10
    }
}
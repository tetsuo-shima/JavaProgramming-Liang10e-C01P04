package com.dfrancis.liang10e.C01P04;

/*
(Print a table) Write a program that displays the following table:
        a       a^2     a^3
        1       1       1
        2       4       8
        3       9       27
        4       16      64
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("a\t\ta^2\t\ta^3");

	    for (int index = 1; index <= 4; index++){
            System.out.printf("%d\t\t%d\t\t%d\n", index, (int)Math.pow(index,2), (int)Math.pow(index,3));
        }
    }
}



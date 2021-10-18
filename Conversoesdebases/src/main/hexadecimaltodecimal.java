package main;

import java.util.Scanner;

import main.conversores.Conversores;

public class hexadecimaltodecimal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Digite um valor em Hexadecimal===");
        String decimal = sc.next();

        System.out.println("");

        Conversores.hexadecimalADecimal(decimal);
    }
}
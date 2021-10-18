package main;

import java.util.Scanner;

import main.conversores.Conversores;

public class Binariotodecimal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Digite um valor em Binario===");
        int decimal = sc.nextInt();

        System.out.println("");

        Conversores.binarioADecimal(decimal);
    }

}

package main;

import java.util.Scanner;

import main.conversores.Conversores;

	public class decimaltohexadecimal {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("===Digite um valor em decimal===");
	        int hexadecimal = sc.nextInt();

	        System.out.println("");

	        Conversores.decimalAHexadecimal(hexadecimal);
	    }
}

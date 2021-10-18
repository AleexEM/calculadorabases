package main.conversores;

public class Conversores {
	
	//CONVERSAO DE DECIMAL PARA BINARIO
    public static void decimalParaBinario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            binario = decimal % 2 + binario;
            decimal = decimal / 2;
        }
        System.out.println("--Binario: " + binario);
    }
    
    
    //CONVERSAO DE BINARIO A DECIMAL
    public static void binarioADecimal(int binario) {
	    int decimal = 0;
	    int potencia = 0;
	    while (true) {
	        if (binario == 0) {
	            break;
	        } else {
	            int temp = binario % 10;
	            decimal += temp * Math.pow(2, potencia);
	            binario = binario / 10;
	            potencia++;
	        }
	    }
	    System.out.println("O Valor em Decimal é:" + decimal);
	}
    
    //CONVERSAO DE DECIMAL PARA HEXADECIMAL
    public static void decimalAHexadecimal(int decimal) {
	    int residuo;
	    String hexadecimal = "";
	    char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	    while (decimal > 0) {
	        residuo = decimal % 16;
	        char caracterHexadecimal = caracteresHexadecimales[residuo];
	        hexadecimal = caracterHexadecimal + hexadecimal;
	        decimal = decimal / 16;
	    }
		System.out.println("O Valor em Hexadecimal é:" + hexadecimal);
	}
    
    
    //CONVERSAO DE HEXADECIMAL PARA DECIMAL
    public static void hexadecimalADecimal(String hexadecimal) {
	    String caracteresHexadecimales = "0123456789ABCDEF";
	    hexadecimal = hexadecimal.toUpperCase();
	    int decimal = 0;
	    for (int i = 0; i < hexadecimal.length(); i++) {
	        char caracter = hexadecimal.charAt(i);
	        int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
	        decimal = 16 * decimal + posicionEnCaracteres;
	    }
	     System.out.println("O Valor em Decimal é:" + decimal);
	}
    
//    public static void decimalParaOctal(int decimal) {
//        int residuo;
//        String octal = "";
//        char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
//        while (decimal > 0) {
//            residuo = decimal % 8;
//            char caracter = caracteresOctales[residuo];
//            octal = caracter + octal;
//            decimal = decimal / 8;
//        }
//        System.out.println("--Octal: " +  octal);
//    }
    
//    public static void decimalParaHexadecimal(int decimal) {
//        int residuo;
//        String hexadecimal = "";
//        char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//        while (decimal > 0) {
//            residuo = decimal % 16;
//            char caracterHexadecimal = caracteresHexadecimales[residuo];
//            hexadecimal = caracterHexadecimal + hexadecimal;
//            decimal = decimal / 16;
//        }
//        System.out.println("--Hexadecimal: " + hexadecimal);
//        
// }
}


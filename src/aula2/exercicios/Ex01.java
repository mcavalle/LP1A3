package aula2.exercicios;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[]args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numeroDigitado = num.nextInt();

        System.out.println((numeroDigitado - 1) + " " + (numeroDigitado) + " " + (numeroDigitado + 1));

        num.close();
    }


}

package aula2.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        float n1 = num.nextFloat();

        System.out.println("Digite segundo número: ");
        float n2 = num.nextFloat();

        System.out.println("Digite terceiro número: ");
        float n3 = num.nextFloat();

        System.out.println("A média dos números é: " + (n1 + n2 + n3)/3);

    }
}

package aula2.exercicios;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código identificador: ");
        String identificador = sc.nextLine();
        
        boolean valido = false;

        if(identificador.startsWith("BR")){
            valido = true;
        }

        if(identificador.endsWith("X")){
            valido = true;
        }

        if(identificador.length() == 7){
            valido = true;
        }

        if (valido == true) {
            System.out.println("Código identificador válido");
        } else {
            System.out.println("Código identificador inválido");
        }

        sc.close();
    }

}

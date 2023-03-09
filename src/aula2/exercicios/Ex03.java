package aula2.exercicios;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valor = sc.nextFloat();

        if (valor > 0 && valor < 10){
            System.out.println("O valor da sua compra é: " + valor);
        }else if (valor >=10 && valor < 100){
            System.out.println("O valor da sua compra é: " + (valor - (valor * 0.05)));
        }else if(valor >= 100 && valor < 500){
            System.out.println("O valor da sua compra é: " + (valor - (valor * 0.1)));
        }else if(valor >= 500){
            System.out.println("O valor da sua compra é: " + (valor - (valor * 0.15)));
        }else{
            System.out.println("Insira um valor");
        }
        
        sc.close();
    }
}

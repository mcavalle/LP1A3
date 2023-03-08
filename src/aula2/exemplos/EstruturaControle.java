package aula2.exemplos;

public class EstruturaControle{
    public static void main(String[] args) {

        var idade = 19;
    
        if(idade >= 19){
            System.out.println("Maior de idade");
        }
    
        var ligado = true;
        if(ligado){
            System.out.println("Ligado");
        } else{
            System.out.println("Desligado");
        }
    
        int contador = 0;
        while (contador < 3){
            System.out.println("Teste" + contador);
        }
    
        contador = 0;
        do{
            System.out.println("Teste" + contador);
        } while (contador < 3);
    
    
        String[] palavras = {"Olá", "Mundo", "!"};
    
        for (int i = 0; i < args.length; i++){
            System.out.println(palavras[i]);
        }
    
        for(String palavra : palavras){
            System.out.println(palavra);
        }
    
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Um");
                break;
        
            case 2:
                System.out.println("Dois");
                break;
            
            case 3:
                System.out.println("Três");
                break;
    
            default:
            System.out.println("??");
                break;
        }
     }
    }

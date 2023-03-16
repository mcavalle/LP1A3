package aula3.exemplos;

public class Cliente {
    private int codigo;
    private String nome;
    private String email;
    private Endereco endereco;
    
    //Agregação
    public Cliente(int codigo, String nome, String email, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

   //Composição
    public Cliente(int codigo, String nome, String email, String cep, int numero, String complemento){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.endereco = new Endereco(cep, numero, complemento);
    }

}

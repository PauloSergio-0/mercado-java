package br.com.paulo.mercado.cliente;


public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente(int id, String nome , String cpf, String telefone, String endereco){
        this.id = id;
        this.nome = nome ;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Id: " + this.id
                +"Nome: " + this.nome
                +"Cpf: " + this.cpf
                +"Telefone: " + this.telefone
                +"Endereço" + this.endereco;
    }
}

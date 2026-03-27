package br.com.paulo.mercado.cliente;


public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private Boolean status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getId() {
        return id;
    }

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

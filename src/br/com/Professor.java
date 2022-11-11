package br.com;

public class Professor {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Professor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Professor(String Nome, int i, int i1) {
    }

    public static void main(String[] args) {
        Professor emp1;

        emp1 = new Professor("Afonso", 5023, 12);
        System.out.println(emp1.getInfo());

    }

    boolean getInfo() {
        return false;
    }

}


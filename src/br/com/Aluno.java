package br.com;

public class Aluno {
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

    public Aluno(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Aluno(String nome, int i, int i1) {
    }

    public static void main(String[] args) {
        Aluno emp1 = null;

        Aluno emp = new Aluno("Pedro", 500, 209);
        System.out.println(emp1.getInfo());

    }

    private boolean getInfo() {
        return false;
    }

}


